package com.example.mimall.mi.controller;
/**
 * @Author: kotori
 * @Date: 2020/10/15 15:17
 * @Description:
 */

import com.example.mimall.mi.entity.front.Member;
import com.example.mimall.mi.entity.front.MemberLoginRegist;
import com.example.mimall.mi.entity.vo.ResultVO;
import com.example.mimall.mi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MemberController
 * @Description TODO
 * @Author kotori
 */
@RestController
public class MemberController extends BaseController{
    @Autowired
    LoginService loginService;
    @PostMapping("/member/login")
    public ResultVO login(@RequestBody MemberLoginRegist loginRegist){
        final Member member = loginService.userLogin(loginRegist.getUserName(),loginRegist.getUserPwd());
        if (member.getState() == 0)
            return failedResult(member.getMessage(),member);
        else return  result(member);
    }

//    @GetMapping("/member/checkLogin")
//    public ResultVO checkLogin()

}
