package com.zk.myservlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class mysevlet implements Servlet{
	//servlet�������ڹ��췽��
	public mysevlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	//servlet�������ڹ��췽��
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init");
	}
	//servlet�������ڹ��췽��
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello,Servlet");
	}
	//servlet�������ڹ��췽��
	//�����������ť�رշ�����ʱ������destory����
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
