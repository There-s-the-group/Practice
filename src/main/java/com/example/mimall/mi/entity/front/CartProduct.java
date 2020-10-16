package com.example.mimall.mi.entity.front;
/**
 * @Author: kotori
 * @Date: 2020/10/15 16:26
 * @Description:
 */

import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName CartProduct
 * @Description TODO
 * @Author kotori
 */
@Data
public class CartProduct {
    private Long productId;

    private BigDecimal salePrice;

    private Long productNum;

    private Long limitNum;

    private String checked;

    private String productName;

    private String productImg;
}
