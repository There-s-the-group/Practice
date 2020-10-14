package com.example.mimall.mi.entity;
/**
 * @Author: kotori
 * @Date: 2020/10/14 16:13
 * @Description:
 */

import lombok.Data;

/**
 * @ClassName TbDict
 * @Description TODO
 * @Author kotori
 */
@Data
public class TbDict {
    /**
     *
     */
    private Integer id;

    private String dict;
    /**
     * 1扩展词 0停用词
     */
    private Integer type;
}
