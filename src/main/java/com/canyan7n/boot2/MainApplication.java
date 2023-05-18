package com.canyan7n.boot2;

import ch.qos.logback.classic.db.SQLBuilder;
import com.canyan7n.boot2.beanconfig.MyBeanConfig;
import com.canyan7n.boot2.pojo.Car;
import com.canyan7n.boot2.pojo.Pet;
import com.canyan7n.boot2.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MainApplication
 * @date ：2023/4/17 21:38
 * @description：主程序类
 */
@ServletComponentScan
@SpringBootApplication
// @ComponentScan(value = "com.canyan7n.boot2.controller")
//     @SpringBootConfiguration
//     @EnableAutoConfiguration
//     @ComponentScan("com.canyan7n.boot2")
public class MainApplication {
    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        /*
        获取ioc容器的所有组件
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }*/

        /*
        获取ioc容器的组件个数
        int count = run.getBeanDefinitionCount();
        System.out.println(count);
        */

        /*
        测试@configuration,@bean注解
        String[] beanNamesForType = run.getBeanNamesForType(WebMvcProperties.class);
        System.out.println("WebMvcProperties=" + beanNamesForType.length);

        User user = run.getBean(User.class);
        User user1 = run.getBean(User.class);
        System.out.println("是否单例" + (user == user1));
        MyBeanConfig myBeanConfig = run.getBean(MyBeanConfig.class);
        System.out.println("我的bean配置类" + myBeanConfig);
        User user01 = myBeanConfig.user01();
        User user02 = myBeanConfig.user01();
        System.out.println("外部调方法" + (user01 == user02));

        System.out.println("======");
        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        String[] beanNamesForType1 = run.getBeanNamesForType(Pet.class);
        for (String s : beanNamesForType1) {
            System.out.println(s);
        }
        SQLBuilder bean = run.getBean(SQLBuilder.class);
        System.out.println(bean);

        boolean tom1 = run.containsBean("tom1");
        System.out.println("tom1组件："  + tom1);
        //
        boolean tom = run.containsBean("tom");
        System.out.println("tom组件："  + tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("user01组件："  + user01);

        boolean haha = run.containsBean("haha");
        System.out.println("haha:" + haha);
        boolean hehe = run.containsBean("hehe");
        System.out.println("hehe:" + hehe);

        Car bean = run.getBean(Car.class);
        System.out.println(bean.getBrand());
        System.out.println(bean.getPrice());
        */
    }
}
