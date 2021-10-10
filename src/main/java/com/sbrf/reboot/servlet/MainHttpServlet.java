package com.sbrf.reboot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet("/home")
public class MainHttpServlet extends HttpServlet {

    private AtomicInteger counter = new AtomicInteger(0);

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException{
        HttpSession session = req.getSession();
        counter.getAndIncrement();
        session.setAttribute("visitCounter", counter);
        String name = null == req.getParameter("name") ? "Anonymous" : req.getParameter("name");
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Привет, " + name + "\nВы " + counter + "-й посетитель");
        printWriter.close();
    }
}
