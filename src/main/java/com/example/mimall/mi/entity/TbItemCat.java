package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/14 16:21
 * @Description: 分类标签
 */

import lombok.Data;

import java.util.Date;

/**
 * @ClassName TbItemCat
 * @Description TODO
 * @Author kotori
 */
@Data
public class TbItemCat {
    /**
     * 类目ID
     */
    private Long id;
    /**
     * 父分类ID=0时代表一级根分类
     */
    private Long parentId;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 状态 1启用 0禁用
     */
    private Integer status;
    /**
     * 在父分类下的顺序 排列序号
     */
    private Integer sortOrder;
    /**
     * 是否为父分类 1为true 0为false
     */
    private Boolean isParent;
    /**
     * 图标
     */
    private String icon;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建日期
     */
    private Date created;
    /**
     * 最近更新日期
     */
    private Date updated;
}
