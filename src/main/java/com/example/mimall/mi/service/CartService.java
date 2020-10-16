package com.example.mimall.mi.service;

import com.example.mimall.mi.entity.CartProduct;
import com.example.mimall.mi.entity.front.Cart;

import java.util.List;

/**
 * @Author: kotori
 * @Date: 2020/10/15 18:56
 * @Description: 购物车接口
 */
public interface CartService {
    /**
     * 添加
     * @param userId
     * @param itemId
     * @param num
     * @return
     */
    int addCart(long userId, long itemId, int num);

    /**
     * 获取
     * @param userId
     * @return
     */
    List<Cart> getCartList(long userId);

    /**
     * 更新
     * @param userId
     * @param itemId
     * @param num
     * @param checked
     * @return
     */
    int updateCartNum(long userId, long itemId, int num,String checked);

    /**
     * 删除单个
     * @param userId
     * @param itemId
     * @return
     */
    int deleteCartItem(long userId, long itemId);

    /**
     * 全选反选
     * @param userId
     * @param checked
     * @return
     */
    int checkAll(long userId,String checked);

    /**
     * 删除全部勾选的
     * @param userId
     * @return
     */
    int delChecked(long userId);
}