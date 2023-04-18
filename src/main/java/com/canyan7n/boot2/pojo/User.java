package com.canyan7n.boot2.pojo;

import org.springframework.stereotype.Component;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :User
 * @date ：2023/4/18 10:50
 * @description：TODO
 */
public class User {

    private String name;

    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }
}
