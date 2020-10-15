package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/15 16:19
 * @Description:
 */

import lombok.Data;

/**
 * @ClassName ZTreeNode
 * @Description TODO
 * @Author kotori
 */
@Data
public class ZTreeNode {
    private int id;

    private int pId;

    private String name;

    private Boolean isParent;

    private Boolean open;

    private String icon;

    private int status;

    private int sortOrder;

    private String remark;

    /**
     * 板块限制商品数量
     */
    private int limitNum;

    /**
     * 板块类型
     */
    private int type;
}
