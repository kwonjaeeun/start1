package com.edu.test;

import java.io.IOException;

import javax.servlet.*;

public class FlowFiltertwo implements Filter {
	String charset;
	public void init(FilterConfig config) {
		System.out.println("init()호출----------two");
		charset=config.getInitParameter("en");
	}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws java.io.IOException, ServletException {
		req.setCharacterEncoding(charset);
		System.out.println("dofilter호출전-------two");
		chain.doFilter(req, res);
		System.out.println("dofilter호출후-------two");
		
	}
	public void destroy() {
		System.out.println("destoy()호출---------two");
	}
}
