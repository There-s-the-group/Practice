package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/15 16:21
 * @Description:
 */

import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName Product
 * @Description TODO
 * @Author kotori
 */
@Data
public class Product {
    private Long productId;

    private BigDecimal salePrice;

    private String productName;

    private String subTitle;

    private String picUrl;
}
