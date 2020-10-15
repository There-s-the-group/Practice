package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/14 16:45
 * @Description: 版块里面的内容
 */

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName TbPanelContent
 * @Description TODO
 * @Author kotori
 */
@Data
public class TbPanelContent {
    /**
     * id
     */
    private Integer id;
    /**
     * 所属板块id
     */
    private Integer panelId;
    /**
     * 类型 0关联商品 1其他链接
     */
    private Integer type;
    /**
     * 关联商品id
     */
    private Long productId;

    private Integer sortOrder;
    /**
     * 其他链接
     */
    private String fullUrl;
    /**
     * 产品图片的url
     */
    private String picUrl;

    private String picUrl2;

    private String picUrl3;

    private Date created;

    private Date updated;

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
}
