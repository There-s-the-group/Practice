package com.example.mimall.mi.controller;
/**
 * @Author: kotori
 * @Date: 2020/10/14 17:58
 * @Description: Home 页面的Controller
 */

import com.example.mimall.mi.entity.vo.ResultVO;
import com.example.mimall.mi.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName HomeController
 * @Description TODO
 * @Author kotori
 */
@RestController
public class HomeController extends BaseController{
    @Autowired
    ContentService contentService;
    @GetMapping("/goods/home")
    public ResultVO fetchGet(){
        return contentService.getHome();
    }
}
