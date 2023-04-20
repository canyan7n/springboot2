package com.canyan7n.boot2.controller;

import com.canyan7n.boot2.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :PersonController
 * @date ：2023/4/20 10:26
 * @description：TODO
 */
@RestController
public class PersonController {

    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person responseToPerson(){
        return person;
    }
}
