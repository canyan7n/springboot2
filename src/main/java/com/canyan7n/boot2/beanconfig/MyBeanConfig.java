package com.canyan7n.boot2.beanconfig;

import ch.qos.logback.classic.db.SQLBuilder;
import com.canyan7n.boot2.pojo.Car;
import com.canyan7n.boot2.pojo.Pet;
import com.canyan7n.boot2.pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MyBeanConfig
 * @date ：2023/4/18 10:52
 * @description：TODO
 */
@Configuration(proxyBeanMethods = false)
//导入类，容器创建调用无参构造器创建实例，id就是全类名
@Import({Pet.class, SQLBuilder.class, Car.class})
// @ConditionalOnBean(name = "tom1")
@ConditionalOnMissingBean(name = "tom1")
@ImportResource("classpath:ioc.xml")
@EnableConfigurationProperties
public class MyBeanConfig {

    //返回值就是组件类型，方法名就是组件id
    @Bean
    public User user01(){
        return new User("zhangsan",11);
    }

    @Bean("tom")
    public Pet pet01(){
        return new Pet("tom01");
    }
}
