package com.canyan7n.boot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :HelloController
 * @date ：2023/4/17 21:41
 * @description：TODO
 */
@Controller
@ResponseBody
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot2";
    }
}
