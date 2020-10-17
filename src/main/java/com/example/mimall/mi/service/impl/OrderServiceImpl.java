package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/16 08:45
 * @Description:
 */

import com.example.mimall.mi.entity.front.CartProduct;
import com.example.mimall.mi.entity.front.Order;
import com.example.mimall.mi.entity.front.OrderInfo;
import com.example.mimall.mi.entity.front.PageOrder;
import com.example.mimall.mi.mapper.TbOrderMapper;
import com.example.mimall.mi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class OrderServiceImpl extends BaseService implements OrderService {
    @Autowired
    TbOrderMapper tbOrderMapper;
    @Override
    public PageOrder getOrderList(Long userId, int page, int size) {
        final List<Order> orderList = tbOrderMapper.getOrderList(userId, (page-1)*size, size);
        for (Order o :
                orderList) {
            final List<CartProduct> goodsOfOrder = tbOrderMapper.getGoodsOfOrder(o.getOrderId());
            o.setGoodsList(goodsOfOrder);
            BigDecimal total=new BigDecimal("0.00");
            for (CartProduct c: goodsOfOrder ) {
                total= total.add(c.getSalePrice().multiply(new BigDecimal(c.getBuyNum())));
            }
            o.setOrderTotal(total);
        }
        PageOrder pageOrder = new PageOrder();
        pageOrder.setData(orderList);
        pageOrder.setTotal(orderList.size());
        return pageOrder;
    }

    @Override
    public Order getOrder(Long orderId) {
        return null;
    }

    @Override
    public int cancelOrder(Long orderId) {
        return 0;
    }

    @Override
    public Long createOrder(OrderInfo orderInfo) {
        return null;
    }

    @Override
    public int delOrder(Long orderId) {
        return tbOrderMapper.delOrder(orderId);
    }
}
