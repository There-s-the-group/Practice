package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/14 16:14
 * @Description:
 */

import lombok.Data;

import java.util.Date;

/**
 * @ClassName Express
 * @Description TODO
 * @Author kotori
 */
@Data
public class TbExpress {
    /**
     * 快递ID
     */
    private Integer id;
    /**
     * 商品描述
     */
    private String expressName;
    /**
     * 排序
     */
    private Integer sortOrder;
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 更新时间
     */
    private Date updated;
}
