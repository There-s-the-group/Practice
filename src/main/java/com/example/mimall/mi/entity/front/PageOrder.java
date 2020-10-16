package com.example.mimall.mi.entity.front;
/**
 * @Author: kotori
 * @Date: 2020/10/16 09:29
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Order> getData() {
        return data;
    }

    public void setData(List<Order> data) {
        this.data = data;
    }
}
