package com.canyan7n.boot2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :User
 * @date ：2023/4/18 10:50
 * @description：TODO
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {

    private String name;

    private Integer age;

}
