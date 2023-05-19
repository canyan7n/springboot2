package com.canyan7n.boot2.servlet;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.webservices.WebServicesProperties;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MyServlet
 * @date ：2023/5/18 21:39
 * @description：TODO
 */
// @WebServlet(urlPatterns = "/my")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("自定义servlet");
    }
}
