package org.sece.admin;

import org.sece.core.CoreClass;
import org.sece.core.catalog.model.TestClass;
import org.sece.core.catalog.repo.TestRepo;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;

public class AdminServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("Hello Admin");
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        CoreClass coreClass = ctx.getBean(CoreClass.class);
        AdminClass adminClass = ctx.getBean(AdminClass.class);
        TestRepo testRepo = ctx.getBean(TestRepo.class);
        testRepo.save(new TestClass("Odil"));
        testRepo.save(new TestClass("Elbek"));
        out.println(coreClass.say());
        out.println(adminClass.say());
        out.close();
    }
}