package com.example.mimall.mi.controller;
/**
 * @Author: kotori
 * @Date: 2020/10/15 18:53
 * @Description:
 */

import com.example.mimall.mi.entity.front.Cart;
import com.example.mimall.mi.entity.vo.ResultVO;
import com.example.mimall.mi.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName CartController
 * @Description 购物车控制
 * @Author kotori
 */
@RestController
public class CartController extends BaseController{
    @Autowired
    CartService cartService;
    /**
     * 添加购物车
     * @param cart
     * @return
     */
    @PostMapping("/member/addCart")
    public ResultVO addCart(@RequestBody Cart cart){
        System.out.println(cart.getChecked());
        final int i = cartService.addCart(cart.getUserId(), cart.getProductId(), cart.getProductNum(),cart.getChecked());
        return  result(i);
    }

    /**
     * 获取购物车商品列表
     * @param cart
     * @return
     */
    @PostMapping("/member/cartList")
    public ResultVO getCartList(@RequestBody Cart cart){
        final List<Cart> cartList = cartService.getCartList(cart.getUserId());
        return result(cartList);
    }

    /**
     * 删除购物车商品
     * @param cart
     * @return
     */
    @PostMapping("/member/cartDel")
    public ResultVO deleteCartItem(@RequestBody Cart cart){
        final int i = cartService.deleteCartItem(cart.getUserId(), cart.getProductId());
        return result(i);
    }

    /**
     * 删除选中的购物车
     * @param cart
     * @return
     */
    @PostMapping("/member/delCartChecked")
    public ResultVO delChecked(@RequestBody Cart cart){
        final int i = cartService.delChecked(cart.getUserId());
        return result(i);
    }

    /**
     * 编辑购物车的信息
     * @param cart
     * @return
     */
    @PostMapping("/member/cartEdit")
    public ResultVO updateCartNum(@RequestBody Cart cart){
        final int i = cartService.updateCartNum(cart.getUserId(), cart.getProductId(), cart.getProductNum(), cart.getChecked());
        return result(i);
    }

    /**
     * 是否全选购物车商品
     * @param cart
     * @return
     */
    @PostMapping("/member/editCheckAll")
    public ResultVO editCheckAll(@RequestBody Cart cart){
        final int i = cartService.checkAll(cart.getUserId(), cart.getChecked());
        return result(i);
    }
}
