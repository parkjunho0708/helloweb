package kr.co.itcen.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// POST 방식의 문자열 엔코딩
		request.setCharacterEncoding("UTF-8");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String birthYear = request.getParameter("birth-year");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobby");
		String selfIntro = request.getParameter("self-intro");
		
		// 응답 문자열 엔코딩
		response.setContentType("text/html; charset=utf-8");
		
		System.out.println(email + ":" + password + ":" + birthYear + ":" + gender);
		for(String hobby : hobbies) {
			System.out.println(hobby);
		}
		
		System.out.println(selfIntro);
		
		PrintWriter out = response.getWriter();
		out.println("<h1>안녕~</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
