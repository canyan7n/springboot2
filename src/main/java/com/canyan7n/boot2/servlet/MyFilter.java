package com.canyan7n.boot2.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MyFilter
 * @date ：2023/5/18 22:29
 * @description：TODO
 */
// @WebFilter(urlPatterns = "/static/*")
@Slf4j
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("myfilter初始化");
    }

    @Override
    public void destroy() {
        log.info("myfilter销毁");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request,response);
        log.info("myfilter正在工作");
    }
}
