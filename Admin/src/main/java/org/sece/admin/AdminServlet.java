package org.sece.admin;

import org.sece.core.CoreClass;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AdminServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("Hello Admin");
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        CoreClass coreClass = ctx.getBean(CoreClass.class);
        AdminClass adminClass = ctx.getBean(AdminClass.class);
        out.println(adminClass.say());
        out.println(coreClass.say());
        out.close();
    }
}