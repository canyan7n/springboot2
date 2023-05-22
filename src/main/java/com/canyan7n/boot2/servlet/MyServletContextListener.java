package com.canyan7n.boot2.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MyListener
 * @date ：2023/5/18 22:46
 * @description：TODO
 */
// @WebListener
@Slf4j
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("contextInitialized监听到项目启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("contextInitialized监听到项目销毁");
        log.info("哪个类" + MyServletContextListener.class.getName());
    }
}
