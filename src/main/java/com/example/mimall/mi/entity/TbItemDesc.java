package com.example.mimall.mi.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;
@Data
public class TbItemDesc {
    @TableId
    private Long itemId;

    private Date created;

    private Date updated;

    private String itemDesc;
}
