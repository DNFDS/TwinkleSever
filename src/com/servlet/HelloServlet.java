package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    private String message;

    @Override
    public void init() throws ServletException{
        message = "Hello ,this is from Servlet";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>"+message+"</h1>");
    }
    @Override
    public void destroy(){
        super.destroy();
    }

}
