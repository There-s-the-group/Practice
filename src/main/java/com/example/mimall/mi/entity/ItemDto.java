package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/15 16:18
 * @Description:
 */

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName ItemDto
 * @Description TODO
 * @Author kotori
 */
@Data
public class ItemDto {
    private Long id;

    private String title;

    private String sellPoint;

    private BigDecimal price;

    private Integer num;

    private Integer limitNum;

    private String detail;

    private String image;

    private Long cid;

    private String cname;

    private Byte status;

    private Date created;

    private Date updated;
}
