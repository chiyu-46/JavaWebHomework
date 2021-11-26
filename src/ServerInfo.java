import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/ServerInfo")
public class ServerInfo extends GenericServlet {
    public void service(ServletRequest request,
                        ServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ServletContext sc = getServletContext();
        out.println("<html lang=\"zh-CN\">");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\">");
        out.println("<title>获取应用程序服务器端信息</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>应用程序服务器端信息：</h2>");
        out.println("<table width=\"500\" border=\"1\">");

        out.println("<tr>");
        out.println("<td width=\"175\">站点名</td>");
        out.println("<td width=\"325\">" + request.getServerName() + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>端口号</td>");
        out.println("<td>" + request.getServerPort() + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>服务器类型</td>");
        out.println("<td>" + sc.getServerInfo() + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>支持Servlet版本</td>");
        out.println("<td>"+sc.getMajorVersion()+"."+sc.getMinorVersion()+"</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>服务器属性</td>");
        out.println("<td>");
        // 获得服务器属性集合
        Enumeration<String> attributes = sc.getAttributeNames();
        while (attributes.hasMoreElements()) {
            String name = (String)attributes.nextElement();
            out.println(name);
        }
        out.println("</td>");
        out.println("</tr>");

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

}
