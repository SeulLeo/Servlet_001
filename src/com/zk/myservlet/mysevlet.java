package com.zk.myservlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class mysevlet implements Servlet{
	//servlet生命周期构造方法
	public mysevlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	//servlet生命周期构造方法
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init");
	}
	//servlet生命周期构造方法
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello,Servlet");
	}
	//servlet生命周期构造方法
	//点击服务器按钮关闭服务器时，调用destory方法
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory");
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
