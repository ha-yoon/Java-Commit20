package com.java.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet02")
public class Servlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		Enumeration<String> e = request.getParameterNames();
		// getParameterNames는 반환타입이 Enumeration 타입으로
		// 요청 페이지의 모든 파라미터 이름이 저장된 목록을 반환한다. 
		// Enumeration는 ctrl + space로 상단에 import 해야함 
		
		while(e.hasMoreElements()) {
			// 읽어올 요소가 있다면 true, 그렇지 않다면 false
			
			String name = e.nextElement();
			// 다음 요소를 읽어온다. 
			
			String[] values = request.getParameterValues(name);
			
			for(String value: values) {
				System.out.println("name: " + name + ", value: " + value);
			}
			
			
		}
	}

}
