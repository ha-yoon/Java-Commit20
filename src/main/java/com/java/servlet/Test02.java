package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Test02")
public class Test02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 넘어온 단 받기
		// 넘어온 단이 2 ~ 9단까지라면 웹브라우저에 
		// 해당하는 구구단 출력 아니라면 웹브라우저에 잘못입력했다고 출력하기
		
		String str = request.getParameter("dan");
		
		if(str == "" || str == null) {
			return;
		}
		
		int dan = Integer.parseInt(str);
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		if(dan < 2 || dan > 9) {
			out.print("<h1>숫자 2부터 9까지만 입력해주세요~</h1>");
		}else {
			
			for(int num = 1; num < 10; num++) {
				
				out.print("<p>" + dan + "X" + num + "=" + dan*num + "</p>");
			}
		}
		out.close();
	}

}
