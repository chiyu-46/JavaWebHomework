package com.filter;

import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {
    protected String encoding = null;
    protected FilterConfig config;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
        // 得到在web.xml中配置的编码
        this.encoding = filterConfig.getInitParameter("encoding");
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        if (request.getCharacterEncoding() == null) {
            if (this.encoding != null) {
                //设置request的编码
                request.setCharacterEncoding(this.encoding);
                //设置response的编码
                response.setCharacterEncoding(this.encoding);
            }
        }
        chain.doFilter(request, response);
    }

    public void destroy() {
    }

}
