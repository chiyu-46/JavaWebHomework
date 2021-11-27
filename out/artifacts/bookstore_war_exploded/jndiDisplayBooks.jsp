<%--
  Created by IntelliJ IDEA.
  User: ForUse
  Date: 2021/11/27
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*, javax.sql.*,javax.naming.*"%>
<html>
<head>
    <title>DataSource Test</title>
</head>
<body>
<%
    try {
        Context context = new InitialContext();
        DataSource ds = (DataSource)
                context.lookup("java:comp/env/jdbc/bookDS");
        Connection conn = ds.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM books");
        out.println("<table border=1>");
        out.println("<tr><td>书号</td><td>书名</td><td>作者</td><td>价格</td></tr>");
        while (rs.next()){
            out.println("<tr><td>"+ rs.getString(1)+"</td><td>"+ rs.getString(2)
                    +"</td><td>"+ rs.getString(3)
                    +"</td><td>"+ rs.getString(5)+"</td></tr>");
        }
        out.println("</table>");
        rs.close();
        stmt.close();
        conn.close();
    }catch (Exception e) {
        out.println(e.getMessage());
    }
%>

</body>
</html>
