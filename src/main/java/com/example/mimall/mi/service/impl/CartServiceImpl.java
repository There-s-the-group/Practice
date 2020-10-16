package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/16 08:45
 * @Description:
 */

import com.example.mimall.mi.entity.CartProduct;
import com.example.mimall.mi.service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CartServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class CartServiceImpl extends BaseService implements CartService {
    @Override
    public int addCart(long userId, long itemId, int num) {
        return 0;
    }

    @Override
    public List<CartProduct> getCartList(long userId) {
        return null;
    }

    @Override
    public int updateCartNum(long userId, long itemId, int num, String checked) {
        return 0;
    }

    @Override
    public int deleteCartItem(long userId, long itemId) {
        return 0;
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
