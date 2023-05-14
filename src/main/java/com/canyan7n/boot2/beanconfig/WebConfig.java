package com.canyan7n.boot2.beanconfig;

import com.canyan7n.boot2.interceptor.LoginInterceptor;
import com.canyan7n.boot2.pojo.Pet;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/login");
    }

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

    //自定义数据绑定 转换器
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new Converter<String, Pet>() {
            @Override
            public Pet convert(String source) {
                if (!source.isEmpty()){
                    Pet pet = new Pet();
                    String[] split = source.split(",");
                    pet.setName(split[0]);
                    pet.setAge(Integer.parseInt(split[1]));
                    return pet;
                }
                return null;
            }
        });
    }
}
