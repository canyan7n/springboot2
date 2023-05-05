package com.canyan7n.boot2.controller;

import com.canyan7n.boot2.pojo.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :ResponseJsonController
 * @date ：2023/5/5 16:24
 * @description：TODO
 */
@RestController
public class ResponseJsonController {

    @ResponseBody
    @RequestMapping("/res/person")
    public Person getPerson(){
        Person person = new Person();
        person.setUserName("zhangsan");
        person.setAge(20);
        person.setBoss(true);
        return person;
    }
}
