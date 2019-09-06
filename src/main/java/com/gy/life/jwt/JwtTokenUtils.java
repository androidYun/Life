package com.gy.life.jwt;

import com.gy.life.common.UserToken;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
@Component
public class JwtTokenUtils {

    private static final String PHONE_NUMBER_KEY = "PHONE_NUMBER_KEY";

    private static final String USER_ID = "USER_ID";

    private static final String USER_NAME_KEY = "USER_NAME_KEY";
    @Value("${jwt.secret}")
    private String secret;


    public String createToken(UserToken userToken) {
        Map<String, Object> userMap = new HashMap<String, Object>();
        userMap.put(PHONE_NUMBER_KEY, userToken.getPhoneNumber());
        userMap.put(USER_NAME_KEY, userToken.getUserName());
        userMap.put(USER_ID, userToken.getUserId());
        return generateToken(userMap);
    }

    public String createToken(String userId) {
        Map<String, Object> userMap = new HashMap<String, Object>();
        userMap.put(USER_ID, userId);
        return generateToken(userMap);
    }

    /**
     * 生成token的过期时间
     */
    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + 5120000 * 1000);
    }

    /**
     * 根据负责生成JWT的token
     */
    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    public Integer getUserIdByToken(String token) {
        Integer userId = 0;
        try {
            Claims claimsFromToken = getClaimsFromToken(token);
            userId = (Integer) claimsFromToken.get(USER_ID);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return userId;
    }

    public String getPhoneNumberByToken(String token) {
        String phoneNumber = null;
        try {
            Claims claimsFromToken = getClaimsFromToken(token);
            phoneNumber = (String) claimsFromToken.get(PHONE_NUMBER_KEY);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return phoneNumber;
    }

    /**
     * 判断token是否已经失效
     */
    public boolean isTokenExpired(String token) {
        Date expiredDate = getExpiredDateFromToken(token);
        return expiredDate.before(new Date());
    }

    /**
     * 从token中获取过期时间
     */
    private Date getExpiredDateFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        return claims.getExpiration();
    }

    /**
     * 从token中获取JWT中的负载
     */
    private Claims getClaimsFromToken(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            Logger.getLogger("JWT格式验证失败:{}" + token);
        }
        return claims;
    }

    /**
     * 刷新token
     */
    public String refreshToken(String token) {
        Claims claims = getClaimsFromToken(token);
        return generateToken(claims);
    }
}
