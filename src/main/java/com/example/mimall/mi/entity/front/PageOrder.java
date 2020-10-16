package com.example.mimall.mi.entity.front;
/**
 * @Author: kotori
 * @Date: 2020/10/15 19:42
 * @Description:
 */

import lombok.Data;

import java.util.List;

/**
 * @ClassName PageOrder
 * @Description TODO
 * @Author kotori
 */
@Data
public class PageOrder {
    private int total;

    private List<Order> data;
}
