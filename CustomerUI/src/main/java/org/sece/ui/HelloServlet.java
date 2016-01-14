package org.sece.ui;

import org.sece.core.CoreClass;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("Hello Gradle");
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        CoreClass coreClass = ctx.getBean(CoreClass.class);
        UIClass uiClass = ctx.getBean(UIClass.class);
        out.println(coreClass.say());
        out.println(uiClass.say());
        out.close();
    }
}