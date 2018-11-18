package com.filter;

import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {
    public void destroy() {
        System.out.println("destroy");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        chain.doFilter(req, resp);
        System.out.println("Filter ------------------------------------");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("init");
    }

}
