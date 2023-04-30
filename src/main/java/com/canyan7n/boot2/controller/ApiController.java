package com.canyan7n.boot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

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
    public String testReq(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("msg","ReqMsg");
        response.addCookie(new Cookie("c1","v1"));
        return "forward:/api/success";
    }

    @RequestMapping("/api/success")
    @ResponseBody
    public Map testApi(HttpServletRequest request,HttpServletResponse response){
        HashMap<Object, Object> hashMap = new HashMap<>();
        Object msg = request.getAttribute("msg");
        hashMap.put("msg",msg);
        return hashMap;
    }
}
