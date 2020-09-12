package com.jayram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/doLogin")
public class MyServlet extends HttpServlet{
protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
	System.out.println("Inside servlet");
	PrintWriter out = res.getWriter();
	String username = req.getParameter("uname");
	String password  = req.getParameter("pwd");
	out.println(username);
}
}
