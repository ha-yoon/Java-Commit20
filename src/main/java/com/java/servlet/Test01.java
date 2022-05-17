package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test01")
public class Test01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  			
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 넘어온 숫자 받기
		// 숫자 1부터 넘어온 숫자까지의 합을 구한 후 
		// 웹브라우저에 그 합을 출력하기 
		
		String str = request.getParameter("number");
		
		
		int number = Integer.parseInt(str);
		int i = 1;
		int hap = 0;
		
		for(i = 1; i <= number; i++) {
			hap += i; 
		}
	
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1>1부터" + number + "까지의 합: " + hap + "</h1>");
		
		out.close();
	
	
	}

}
