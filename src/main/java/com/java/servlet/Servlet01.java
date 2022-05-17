package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		// getParameter 메소드로 사용자가 입력한 데이터를 얻을 수 있다.
		// String 타입으로 반환이 된다. 
		
		String[] hobbys =request.getParameterValues("hobby");
		// 하나의 이름으로 여러 데이터가 넘어올 때
		// getParameterValues 메소드로 데이터를 얻을 수 있다. 
		// String[]로 반환이 된다.
		
		String gender =request.getParameter("gender");
		String area =request.getParameter("area");
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>form 데이터</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("이름: " + name + "<br>");
		out.print("아이디: " + id + "<br>");
		out.print("비밀번호: " + pw + "<br>");
		out.print("취미: " + Arrays.toString(hobbys) + "<br>");
		out.print("성별: " + gender + "<br>");
		out.print("사는지역: " + area + "<br>");
		out.print("</body>");
		out.print("</html>");
	
		out.close();
	}
	

}
