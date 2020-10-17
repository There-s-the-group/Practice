package com.example.mimall.mi.entity.front;
/**
 * @Author: kotori
 * @Date: 2020/10/15 19:41
 * @Description:
 */

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName OrderInfo
 * @Description TODO
 * @Author kotori
 */
@Data
public class OrderInfo {
    private String userId;

    private Long addressId;

    private String tel;

    private String userName;

    private String streetName;

    private BigDecimal orderTotal;

    private List<CartProduct> goodsList;
}
