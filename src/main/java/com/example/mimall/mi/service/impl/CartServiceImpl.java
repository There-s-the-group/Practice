package com.example.mimall.mi.service.impl;

import com.example.mimall.mi.entity.CartProduct;
import com.example.mimall.mi.entity.front.Cart;
import com.example.mimall.mi.mapper.TbCartMapper;
import com.example.mimall.mi.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.event.CaretListener;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    TbCartMapper tbCartMapper;

    @Override
    public int addCart(long userId, long itemId, int num) {
        if(num==0){
            return deleteCartItem(userId, itemId);
        }
        List<Cart> cartList = getCartList(userId);
        for(Cart cart:cartList){
            if(cart.getProductId()==itemId){
                return tbCartMapper.updateCart(userId, itemId, num+cart.getProductNum());
            }
        }
        return tbCartMapper.addCart(userId, itemId, num);
    }

    @Override
    public List<Cart> getCartList(long userId) {
        List<Cart> cartList = tbCartMapper.getCartListById(userId);
        System.out.println(cartList);
        return cartList;
    }

    @Override
    public int updateCartNum(long userId, long itemId, int num, String checked) {
        if(num==0){
            return deleteCartItem(userId, itemId);
        }
        return tbCartMapper.updateCart(userId, itemId, num);
    }

    @Override
    public int deleteCartItem(long userId, long itemId) {
        return tbCartMapper.deleteCart(userId, itemId);
    }

    @Override
    public int checkAll(long userId, String checked) {
        return 0;
    }

    @Override
    public int delChecked(long userId) {
        return 0;
    }
}
