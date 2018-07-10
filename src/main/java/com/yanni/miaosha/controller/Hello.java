package com.yanni.miaosha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：
 * 作者:apple
 * 时间:2018/7/10 15:47
 */
@Controller
@RequestMapping("/hello")
public class Hello {

    @RequestMapping("/hello")
    public  String   Hello(){
            return "index";
    }

}
