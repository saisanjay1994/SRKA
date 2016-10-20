package com.srka.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.srka.dto.UserTO;
import com.srka.service.CheckUserService;
import com.srka.service.RegisterService;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserTO to=UserTO.getInstanceTO();
	RegisterService rs;
	CheckUserService cu;
	 public RegisterServlet() {
	        super();
	    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("entered dopost in apply servlet");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		to.setusername(username);
		to.setpassword(password);
		cu = new CheckUserService();
		boolean a = cu.CheckUser();
		if(a)
		{
			//request.setAttribute("errormessage","Username Taken Select another username");
			request.getRequestDispatcher("failedregistration.jsp").forward(request, response);
		}
		else
		{
		rs = new RegisterService();
		rs.Register();
		request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		//request.setAttribute("errormessage","Successfully Registered");
		
	}
}
