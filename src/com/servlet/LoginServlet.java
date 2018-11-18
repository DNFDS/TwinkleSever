package com.servlet;

import com.DAO.AdminDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        if(id == null){
            response.sendRedirect("Login.jsp");
            return;
        }
        if(AdminDAO.IsAdminExit(id,pwd)){
            request.getRequestDispatcher("/Hello").forward(request,response);
        }else{
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>false</h1>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
