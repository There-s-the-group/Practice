package com.example.mimall.mi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mimall.mi.entity.front.CartProduct;
import com.example.mimall.mi.entity.front.Cart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: kotori
 * @Date: 2020/10/16 10:03
 * @Description:
 */
@Mapper
public interface TbCartMapper extends BaseMapper<Cart> {
    List<CartProduct> getCartListById(Long userId);

    int updateCart(long userId, long itemId, int num, int checked);

    int addCart(long userId, long itemId, int num);

    int deleteCart(long userId, long itemId);

    int checkAll(long userId, int checked);

    int deleteChecked(long userId);
}
