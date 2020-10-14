package com.example.mimall.mi.service;
/**
 * @Author: kotori
 * @Date: 2020/10/14 15:39
 * @Description:
 */

import com.example.mimall.mi.entity.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

/**
 * @ClassName BaseService
 * @Description TODO
 * @Author kotori
 */
public class BaseService {

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
}
