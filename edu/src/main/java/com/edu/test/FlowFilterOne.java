package com.edu.test;

import java.io.IOException;

import javax.servlet.*;

public class FlowFilterOne implements Filter {
	public void init(FilterConfig config) {
		System.out.println("init()호출----------one");
	}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws java.io.IOException, ServletException {
		System.out.println("dofilter호출전-------one");
		chain.doFilter(req, res);
		System.out.println("dofilter호출후-------one");
		
	}
	public void destroy() {
		System.out.println("destoy()호출---------one");
	}
}
