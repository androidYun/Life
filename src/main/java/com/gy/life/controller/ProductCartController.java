package com.gy.life.controller;

import com.alibaba.fastjson.JSON;
import com.gy.life.common.ResultEntity;
import com.gy.life.model.ProductCart;
import com.gy.life.service.impl.CartServiceImpl;
import com.gy.life.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/cartProductList", method = RequestMethod.POST)
    public ResultEntity selectCartProductList(@RequestBody CartProductParams cartProductParams) {

        List<Integer> list = JSON.parseArray(cartProductParams.getCartIdJson(), Integer.class);
        List<Integer> cartIdList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            cartIdList.add(list.get(i));
        }
        if (cartIdList.size() == 0) {
            return ResultEntity.getErrorResult("");
        }
        return ResultEntity.getSuccessResult(cartService.selectCartGoodList(cartIdList));
    }

    @RequestMapping(value = "/updateCount", method = RequestMethod.GET)
    public ResultEntity updateCart(int cartId, int cartCount) {
        ProductCart selectProduct = cartService.selectByCart(cartId);
        if (selectProduct == null) {
            return ResultEntity.getErrorResult("此购物车不存在");
        }
        selectProduct.setCartCount(cartCount);
        int updateCount = cartService.updateCart(selectProduct);
        if (updateCount > 0) {
            return ResultEntity.getSuccessResult("更新成功");
        }
        return ResultEntity.getErrorResult("更新失败");
    }

    @RequestMapping(value = "/delete/{cartId}", method = RequestMethod.GET)
    public ResultEntity deleteCart(@PathVariable("cartId") int cartId) {
        int deleteCartCount = cartService.deleteCart(cartId);
        if (deleteCartCount > 0) {
            return ResultEntity.getSuccessResult("删除成功");
        }
        return ResultEntity.getErrorResult("删除失败");
    }
}
