package com.example.mimall.mi.entity.front;
/**
 * @Author: kotori
 * @Date: 2020/10/15 18:55
 * @Description:
 */

import lombok.Data;

/**
 * @ClassName Cart
 * @Description TODO
 * @Author kotori
 */
@Data
public class Cart {
    private Long userId;

    private Long productId;

    private String checked;

    private int productNum;
}
