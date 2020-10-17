package com.example.mimall.mi.entity.front;
/**
 * @Author: kotori
 * @Date: 2020/10/17 14:09
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
