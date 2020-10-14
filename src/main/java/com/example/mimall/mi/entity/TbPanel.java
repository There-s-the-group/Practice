package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/14 16:42
 * @Description: 版块
 */

import lombok.Data;

import java.util.Date;

/**
 * @ClassName TbPanel
 * @Description TODO
 * @Author kotori
 */
@Data
public class TbPanel {
    /**
     * 类目ID
     */
    private Integer id;
    /**
     * 板块名称
     */
    private String name;
    /**
     * 类型 0轮播图 1板块种类一 2板块种类二 3板块种类三
     */
    private Integer type;
    /**
     * 排列序号
     */
    private Integer sortOrder;
    /**
     * 所属位置 0首页 1商品推荐 2我要捐赠
     */
    private Integer position;
    /**
     * 板块限制商品数量
     */
    private Integer limitNum;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 备注
     */
    private String remark;

    private Date created;

    private Date updated;
}
