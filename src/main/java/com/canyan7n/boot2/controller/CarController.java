package com.canyan7n.boot2.controller;

import com.canyan7n.boot2.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :CarController
 * @date ：2023/4/18 12:18
 * @description：TODO
 */
@Controller
@ResponseBody
public class CarController {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car getCar(){
        return car;
    }
}
