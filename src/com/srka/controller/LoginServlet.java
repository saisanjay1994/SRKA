package com.srka.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srka.dto.UserTO;
import com.srka.service.CheckPasswordService;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserTO to=UserTO.getInstanceTO();
	CheckPasswordService cp;
//	LoginService ls;
	public LoginServlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("entered dopost in Login servlet");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		to.setusername(username);
		to.setpassword(password);
		cp = new CheckPasswordService();
		boolean a = cp.CheckPassword(to.getpassword());
		if(a)
		{
		request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		else
		{
//		ls = new LoginService();
//		ls.Login();
		request.getRequestDispatcher("failedlogin.jsp").forward(request, response);
		}
		
	}
}
