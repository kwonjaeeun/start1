package com.edu.test;

import javax.servlet.http.*;

public class TestSessionListener implements HttpSessionListener {
	public TestSessionListener(){
		System.out.println("TestSessionListener 객체생성");
	}
	public void sessionCreated(HttpSessionEvent e) {
		System.out.println("세션객체 생성");
	}
	public void sessionDestroyed(HttpSessionEvent e) {
		System.out.println("세션객채 해제");
	}
}
