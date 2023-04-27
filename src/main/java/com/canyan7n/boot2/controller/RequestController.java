package com.canyan7n.boot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :RequestController
 * @date ：2023/4/23 10:38
 * @description：TODO
 */

@Controller
public class RequestController {

    @RequestMapping ("/goto")
    public String goToPage(HttpServletRequest request){
        request.setAttribute("msg","msg");
        request.setAttribute("code","code");
        return "forward:/success";
    }

    @ResponseBody
    @RequestMapping("/success")
    public Map successPage(@RequestAttribute("msg") String msg,
                           HttpServletRequest request){

        Object code = request.getAttribute("code");
        HashMap<String, Object> hashMap = new HashMap<>();
        // hashMap.put("annotation_msg",msg);
        // hashMap.put("request_msg",code);
        Object hello = request.getAttribute("hello");
        Object world = request.getAttribute("world");
        Object msg_ = request.getAttribute("msg");
        hashMap.put("hello",hello);
        hashMap.put("world",world);
        hashMap.put("msg_",msg_);
        return hashMap;
    }

    //复杂参数
    //向请求域共享数据
    @GetMapping("reqzone")
    public String reqZone(Map map,
                          Model model,
                          HttpServletRequest request,
                          HttpServletResponse response){

        map.put("hello","hello666");
        model.addAttribute("wordl","world666");
        request.setAttribute("msg","hellowordld");
        Cookie cookie = new Cookie("k1", "v1");
        response.addCookie(cookie);
        return "forward:/success";
    }
}
