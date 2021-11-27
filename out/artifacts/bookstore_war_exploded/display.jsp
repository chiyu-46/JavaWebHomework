<%--
  Created by IntelliJ IDEA.
  User: ForUse
  Date: 2021/11/27
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="book" class="com.beans.BookBean" scope="request"/>
<html>
<head>
    <title>display</title>
</head>
<body>
书号：<jsp:getProperty name="book" property="bookid"/>
书名：<jsp:getProperty name="book" property="title"/>
作者：<jsp:getProperty name="book" property="author"/>
出版社：<jsp:getProperty name="book" property="publisher"/>
价格：<jsp:getProperty name="book" property="price"/>
</body>
</html>
