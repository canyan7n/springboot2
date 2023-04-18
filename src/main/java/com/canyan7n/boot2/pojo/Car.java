package com.canyan7n.boot2.pojo;

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
public class Car {

    private String brand;

    private Integer price;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Car(String brand, Integer price) {
        this.brand = brand;
        this.price = price;
    }

    public Car() {
    }
}
