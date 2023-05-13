package com.canyan7n.boot2.controller;

import com.canyan7n.boot2.pojo.LoginUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :ViewController
 * @date ：2023/5/13 14:47
 * @description：TODO
 */
@Controller
public class ViewController {

    @RequestMapping(value = {"/","/login"})
    public String login(){
        return "login";
    }

    // @RequestMapping()
    // public String login(){
    //
    // }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String loginSuccess(LoginUser loginUser, HttpSession session, Model model){
        System.out.println(loginUser);
        if(!StringUtils.isEmpty(loginUser) && "123".equals(loginUser.getPassword())){
            session.setAttribute("loginUser",loginUser);
            return "redirect:/main";
        }else {
            model.addAttribute("msg","密码错误");
            return "login";
        }
    }

    @RequestMapping("/main")
    public String main(HttpSession session,Model model){
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser != null){
            model.addAttribute("loginUser",loginUser);
            return "main";
        }else {
            model.addAttribute("msg","未登录");
            return "login";
        }
    }
}
