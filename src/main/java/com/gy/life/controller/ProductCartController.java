package com.gy.life.controller;

import com.gy.life.common.ResultEntity;
import com.gy.life.model.ProductCart;
import com.gy.life.service.impl.CartServiceImpl;
import com.gy.life.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/cart")
@RestController
public class ProductCartController {

    @Autowired
    CartServiceImpl cartService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultEntity insertCart(@RequestBody ProductCart productCart) {
        if (productCart == null) {
            ResultEntity.getErrorResult("添加的商品不能为空");
        }
        ProductCart selectProduct = cartService.selectByUserId(productCart.getUserId(), productCart.getProductId());

        if (selectProduct != null) {
            selectProduct.setCartCount(selectProduct.getCartCount() + productCart.getCartCount());
            cartService.updateCart(selectProduct);
            return ResultEntity.getSuccessResult("添加成功");
        }
        productCart.setCartTime(DateUtils.INSTANCE.getCurrentTime());
        int insertCartCount = cartService.insertCart(productCart);
        if (insertCartCount > 0) {
            return ResultEntity.getSuccessResult("添加成功");
        } else {
            return ResultEntity.getErrorResult("添加失败");
        }
    }

    @RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
    public ResultEntity selectByCart(@PathVariable("cartId") int cartId) {
        ProductCart productCart = cartService.selectByCart(cartId);
        if (productCart != null) {
            return ResultEntity.getSuccessResult(productCart);
        }
        return ResultEntity.getErrorResult("此物品不存在");
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultEntity selectAllList(int userId) {
        return ResultEntity.getSuccessResult(cartService.selectAllList(userId));
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResultEntity updateCart(int cartId, int buyCount) {
        ProductCart selectProduct = cartService.selectByCart(cartId);
        if (selectProduct == null) {
            return ResultEntity.getErrorResult("此购物车不存在");
        }
        selectProduct.setCartCount(selectProduct.getCartCount() + buyCount);
        int updateCount = cartService.updateCart(selectProduct);
        if (updateCount > 0) {
            return ResultEntity.getSuccessResult("更新成功");
        }
        return ResultEntity.getErrorResult("更新失败");
    }

    @RequestMapping(value = "/delete/{CartId}", method = RequestMethod.POST)
    public ResultEntity deleteCart(@PathVariable("CartId") int CartId) {
        int deleteCartCount = cartService.deleteCart(CartId);
        if (deleteCartCount > 0) {
            return ResultEntity.getSuccessResult("删除成功");
        }
        return ResultEntity.getErrorResult("删除失败");
    }
}
