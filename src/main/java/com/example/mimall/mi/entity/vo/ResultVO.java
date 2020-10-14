package com.example.mimall.mi.entity.vo;
/**
 * @Author: kotori
 * @Date: 2020/10/14 15:28
 * @Description: 作为结果集返回给前端
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName ResultVO
 * @Description TODO
 * @Author kotori
 */
@Data
public class ResultVO implements Serializable {
    /**
     * 用户未登录 代码-1
     */
    public static final int NO_LOGIN = -1;
    /**
     * 成功代码0
     */
    public static final int SUCCESS = 0;
    /**
     * crud操作失败错误代码1
     */
    public static final int FAIL = 1;
    /**
     * 角色不匹配错误代码2
     */
    public static final int ERROR_ROLE = 2;
    /**
     * 禁止错误代码3
     */
    public static final int NO_PERMISSION = 3;
    /**
     * 参数错误代码4
     */
    public static final int INVALID_PARAMETER = 4;
    /**
     * 服务器错误代码10
     */
    public static final int SERVER_ERROR = 10;
    private static final long serialVersionUID = 1L;
    private Integer code; // 返回代码
    private String message;//返回信息
    private Object data;//返回数据
    /**
     * 时间戳
     */
    private long timestamp = System.currentTimeMillis();

    public ResultVO() {

    }

    public ResultVO(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
