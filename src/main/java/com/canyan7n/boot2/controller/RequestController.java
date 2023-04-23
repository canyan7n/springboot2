package com.canyan7n.boot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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
        hashMap.put("annotation_msg",msg);
        hashMap.put("request_msg",code);
        return hashMap;
    }
}
