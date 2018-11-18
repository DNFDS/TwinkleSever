<%--
  Created by IntelliJ IDEA.
  User: lemon
  Date: 2018/11/9
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <title>汪汪汪</title>
</head>
<body >
  用户名：<input type="text" name="id" value=<%=request.getParameter("id")%> ><br>
  密码：  <input type="text" name="pwd" value=<%=request.getParameter("pwd")%> ><br><br>
</body>
</html>
