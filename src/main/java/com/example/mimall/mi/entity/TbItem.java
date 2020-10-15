package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/14 16:17
 * @Description:
 */

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName TbItem
 * @Description TODO
 * @Author kotori
 */
@Data
public class TbItem {
    /**
     * 商品id，同时也是商品编号
     */
    private Long id;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 商品卖点
     */
    private String sellPoint;
    /**
     * 商品价格
     */
    private BigDecimal price;
    /**
     * 商品库存
     */
    private Integer num;
    /**
     *  售卖数量限制
     */
    private Integer limitNum;
    /**
     * 商品图片的url地址
     */
    private String image;
    /**
     * 所属分类
     */
    private Long cid;
    /**
     * 商品状态 1正常 0下架
     */
    private Integer status;
    /**
     * 商品创建时间
     */
    private Date created;
    /**
     * 最近更新日期
     */
    private Date updated;

    public String[] getImages() {
        if (image != null && !"".equals(image)) {
            String[] strings = image.split(",");
            return strings;
        }
        return null;
    }

}
