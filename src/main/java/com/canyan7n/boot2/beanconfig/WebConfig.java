package com.canyan7n.boot2.beanconfig;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :WebConfig
 * @date ：2023/4/22 15:49
 * @description：TODO
 */
@Configuration(proxyBeanMethods = false)
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
        HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
        methodFilter.setMethodParam("_m");
        return methodFilter;
    }

    // @Bean
    // public WebMvcConfigurer webMvcConfigurer(){
    //
    //     // return new WebMvcConfigurer(){
    //     //     @Override
    //     //     public void configurePathMatch(PathMatchConfigurer configurer) {
    //     //         UrlPathHelper urlPathHelper = new UrlPathHelper();
    //     //         urlPathHelper.setRemoveSemicolonContent(false);
    //     //         configurer.setUrlPathHelper(urlPathHelper);
    //     //     }
    //     // };
    // }
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper urlPathHelper = new UrlPathHelper();
        urlPathHelper.setRemoveSemicolonContent(false);
        configurer.setUrlPathHelper(urlPathHelper);
    }
}
