package com.canyan7n.boot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :ApiController
 * @date ：2023/4/30 20:58
 * @description：TODO
 */
@Controller
public class ApiController {

    @RequestMapping("/api/req")
    public String testReq(HttpServletRequest request){
        request.setAttribute("msg","ReqMsg");
        return "forward:/api/success";
    }

    @RequestMapping("/api/success")
    @ResponseBody
    public String testApi(HttpServletRequest request){
        Object msg = request.getAttribute("msg");
        return msg.toString();
    }
}
