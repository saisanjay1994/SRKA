package com.srka.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srka.dto.UserTO;
import com.srka.service.AddItemService;

public class AddItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserTO to=UserTO.getInstanceTO();
	AddItemService ai;
	public AddItemServlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("entered dopost in AddItem Servlet");
		String itemName = request.getParameter("itemName");
		String itemValue = request.getParameter("itemValue"); //REMEMBER to convert to INT later
		String itemUnit = request.getParameter("itemUnit");
		System.out.println(itemName);
		System.out.println(itemValue);
		System.out.println(itemUnit);
		to.setAddItemName(itemName);
		to.setAddItemValue(itemValue);
		to.setAddItemUnit(itemUnit);
		ai = new AddItemService();
		ai.AddItem();
		request.getRequestDispatcher("home.jsp").forward(request, response);	
	}
}
