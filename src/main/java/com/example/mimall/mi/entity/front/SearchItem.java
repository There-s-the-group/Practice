package com.example.mimall.mi.entity.front;
/**
 * @Author: kotori
 * @Date: 2020/10/15 20:38
 * @Description:
 */

import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName SearchItem
 * @Description TODO
 * @Author kotori
 */
@Data
public class SearchItem {
    private Long productId;

    private BigDecimal salePrice;

    private String productName;

    private String subTitle;

    private String productImageBig;

    private String categoryName;

    private Integer cid;
}
