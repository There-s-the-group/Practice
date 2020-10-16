package com.example.mimall.mi.entity.front;
/**
 * @Author: kotori
 * @Date: 2020/10/16 09:30
 * @Description:
 */

import lombok.Data;

import java.util.List;

/**
 * @ClassName AllGoodsResult
 * @Description TODO
 * @Author kotori
 */
@Data
public class AllGoodsResult {
    private int total;

    private List<?> data;
}
