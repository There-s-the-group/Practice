package com.example.mimall.mi.service.impl;
/**
 * @Author: kotori
 * @Date: 2020/10/16 08:45
 * @Description:
 */

import com.example.mimall.mi.entity.front.Order;
import com.example.mimall.mi.entity.front.OrderInfo;
import com.example.mimall.mi.entity.front.PageOrder;
import com.example.mimall.mi.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author kotori
 */
@Service
public class OrderServiceImpl extends BaseService implements OrderService {
    @Override
    public PageOrder getOrderList(Long userId, int page, int size) {
        return null;
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
        return 0;
    }
}
