package com.xike.spribgboot20180325.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//这是一个用于页面进行跳转的页面
@Controller
@RequestMapping("/html")
public class HtmlController {

    @RequestMapping("/index")
    public String toIndex(){

        return "index";
    }

}
