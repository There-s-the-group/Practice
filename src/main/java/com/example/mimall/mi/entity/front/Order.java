package com.example.mimall.mi.entity.front;
/**
 * @Author: kotori
 * @Date: 2020/10/15 19:41
 * @Description:
 */

import com.example.mimall.mi.entity.CartProduct;
import com.example.mimall.mi.entity.TbAddress;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName Order
 * @Description TODO
 * @Author kotori
 */
@Data
public class Order {
    private Long orderId;

    private BigDecimal orderTotal;

    private TbAddress addressInfo;

    private List<CartProduct> goodsList;

    private String orderStatus;

    private String createDate;

    private String closeDate;

    private String finishDate;

    private String payDate;
}
