package com.jayram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/doLogin")
public class FirstFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Inside filter");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		if(uname.length()>1)
		{
			chain.doFilter(request, response);
		}
		else
		{
			out.println("Invalid Input");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
