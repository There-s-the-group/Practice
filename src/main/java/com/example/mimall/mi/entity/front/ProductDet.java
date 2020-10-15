package com.example.mimall.mi.entity.front;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDet {
    private Long productId;

    private BigDecimal salePrice;

    private String productName;

    private String subTitle;

    private Long limitNum;

    private String productImageBig;

    private String detail;

    private List<?> productImageSmall;
}
