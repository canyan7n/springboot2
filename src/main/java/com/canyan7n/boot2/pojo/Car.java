package com.canyan7n.boot2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :Car
 * @date ：2023/4/18 12:15
 * @description：TODO
 */
// @Component
@ConfigurationProperties(prefix = "car")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {

    private String brand;

    private Integer price;

}
