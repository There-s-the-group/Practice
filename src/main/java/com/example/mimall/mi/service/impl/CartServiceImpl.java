package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/16 08:45
 * @Description:
 */

import com.example.mimall.mi.entity.front.CartProduct;
import com.example.mimall.mi.mapper.TbCartMapper;
import com.example.mimall.mi.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CartServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class CartServiceImpl extends BaseService implements CartService {
    @Autowired
    TbCartMapper tbCartMapper;

    @Override
    public int addCart(long userId, long itemId, int num,int checked) {
        if(num==0){
            return deleteCartItem(userId, itemId);
        }
        List<CartProduct> cartList = getCartList(userId);
        for(CartProduct cartProduct:cartList){
            if(cartProduct.getProductId()==itemId){
                return tbCartMapper.updateCart(userId, itemId, num+cartProduct.getBuyNum(), checked);
            }
        }
        return tbCartMapper.addCart(userId, itemId, num);
    }

    @Override
    public List<CartProduct> getCartList(long userId) {
        List<CartProduct> cartList = tbCartMapper.getCartListById(userId);
        System.out.println("service层："+cartList);
        System.out.println();
        return cartList;
    }

    @Override
    public int updateCartNum(long userId, long itemId, int num, int checked) {
        if(num==0){
            return deleteCartItem(userId, itemId);
        }
        return tbCartMapper.updateCart(userId, itemId, num, checked);
    }

    @Override
    public int deleteCartItem(long userId, long itemId) {

        return tbCartMapper.deleteCart(userId, itemId);
    }

    @Override
    public int checkAll(long userId, int checked) {

        return tbCartMapper.checkAll(userId, checked);
    }

    @Override
    public int delChecked(long userId) {
        return tbCartMapper.deleteChecked(userId);
    }
}
