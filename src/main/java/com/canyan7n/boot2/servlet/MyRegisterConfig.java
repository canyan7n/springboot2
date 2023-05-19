package com.canyan7n.boot2.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MyRegisterConfig
 * @date ：2023/5/19 18:17
 * @description：TODO
 */
@Configuration
public class MyRegisterConfig {
    @Bean
    public ServletRegistrationBean myServlet(){
        MyServlet myServlet = new MyServlet();
        return new ServletRegistrationBean(myServlet,"/my");
    }
}
