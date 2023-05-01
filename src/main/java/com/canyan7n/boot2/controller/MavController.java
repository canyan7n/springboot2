package com.canyan7n.boot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
 * @ClassName :ApiController
 * @date ：2023/4/30 20:58
 * @description：TODO
 */
@Controller
public class MavController {

    @RequestMapping("/api/mav")
    public String testReq(HttpServletRequest request,
                          HttpServletResponse response,
                          Map map,
                          Model model){
        map.put("mapMsg","mapmsg");
        model.addAttribute("modelMsg","modelmsg");
        request.setAttribute("reqMsg","Reqmsg");
        response.addCookie(new Cookie("c1","v1"));
        return "forward:/api/complete";
    }

    @RequestMapping("/api/complete")
    @ResponseBody
    public Map testApi(HttpServletRequest request){
        HashMap<Object, Object> hashMap = new HashMap<>();
        Object reqMsg = request.getAttribute("reqMsg");
        Object mapMsg = request.getAttribute("mapMsg");
        Object modelMsg = request.getAttribute("modelMsg");
        hashMap.put("reqMsg",reqMsg);
        hashMap.put("mapMsg",mapMsg);
        hashMap.put("modelMsg",modelMsg);
        return hashMap;
    }
}
