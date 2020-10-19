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
import com.example.mimall.mi.service.MemberService;
import com.example.mimall.mi.service.RegisterService;
import com.example.mimall.mi.util.MinioUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName MemberController
 * @Description 登录控制
 * @Author kotori
 */
@RestController
public class MemberController extends BaseController{
    @Autowired
    LoginService loginService;
    @Autowired
    RegisterService registerService;
    @Autowired
    MemberService memberService;

    /**
     * 登录
     * @param loginRegist
     * @return
     */
    @PostMapping("/member/login")
    public ResultVO login(@RequestBody MemberLoginRegist loginRegist){
        final Member member = loginService.userLogin(loginRegist.getUserName(),loginRegist.getUserPwd());
        if (member.getState() == 0)
            return failedResult(member.getMessage(),member);
        else return  result(member);
    }

//    @GetMapping("/member/checkLogin")
//    public ResultVO checkLogin()

    @GetMapping("/member/loginOut")
    public ResultVO loginOut(String token,int id){
        final int logout = loginService.logout(token, id);
        return result(logout);
    }

    /**
     * 注册
     * @param memberLoginRegist
     * @return
     */
    @PostMapping("/member/register")
    public ResultVO register(@RequestBody MemberLoginRegist memberLoginRegist){
        final int register = registerService.register(memberLoginRegist.getUserName(), memberLoginRegist.getUserPwd());
        return result(register);
    }

    /**
     * 用户上传图片
     */
    @PostMapping("/member/imgaeUpload")
    public ResultVO imgaeUpload(@RequestParam("userId") String userId,
                                @RequestParam("imgData") MultipartFile imgData){
        System.out.println("进来了");
        MinioUtil instance = MinioUtil.getInstance();
        String upLoadFile = instance.upLoadFile(imgData);
        final int i = memberService.imgaeUpload(upLoadFile, Long.parseLong(userId));
        if (i == 0){
            return result(upLoadFile,"上传成功");
        }
        else return failedResult("上传失败");
    }
}
