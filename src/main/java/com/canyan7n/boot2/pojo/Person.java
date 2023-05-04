package com.canyan7n.boot2.pojo;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :Person
 * @date ：2023/4/20 10:01
 * @description：TODO
 */
@Component
@Data
@ToString
@EnableConfigurationProperties(Person.class)
@ConfigurationProperties(prefix = "person")
public class Person {
    private String userName;
    private Integer age;
    private Boolean boss;
    // private Date birth;
    private String[] hobby;
    private List animal;
    private Pet pet;
    // private Map<String,Object> score;
    // private Pet pet;
    // private Map<String,List<Pet>> allPet;
}
