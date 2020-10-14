package com.example.mimall.mi.controller;
/**
 * @Author: kotori
 * @Date: 2020/10/14 15:31
 * @Description: 基础的Controller，以提供正确的返回结果，和错误的返回结果
 */

import com.example.mimall.mi.entity.vo.ResultVO;

/**
 * @ClassName BaseController
 * @Description TODO
 * @Author kotori
 */
public class BaseController {
    protected ResultVO result(Object data) {
        return new ResultVO(ResultVO.SUCCESS, "success", data);
    }

    protected ResultVO result(Object data, String message) {
        return new ResultVO(ResultVO.SUCCESS, message, data);
    }

    protected ResultVO failedResult(String message) {
        return new ResultVO(ResultVO.FAIL, message, null);
    }

    protected ResultVO failedResult(String message, Object data) {
        return new ResultVO(ResultVO.FAIL, message, data);
    }

    protected boolean isNullOrEmpty(String str) {
        return "".equals(str);
    }
}
