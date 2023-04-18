package com.canyan7n.boot2.pojo;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :Pet
 * @date ：2023/4/18 10:50
 * @description：TODO
 */
public class Pet {

    private String name;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
    }
}
