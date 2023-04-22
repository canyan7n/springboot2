package com.canyan7n.boot2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :UserController
 * @date ：2023/4/22 12:36
 * @description：TODO
 */
@RestController
public class UserController {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(){
        return "GET user";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String addUser(){
        return "POST user";
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE user";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateUser(){
        return "PUT user";
    }
}
