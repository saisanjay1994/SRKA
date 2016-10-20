package com.srka.service;

import com.srka.dao.UserDAO;

public class AddItemService {
	UserDAO dao;
		public AddItemService()
		{
			super();
			dao = UserDAO.getInstance();
		}
		public void AddItem()
		{
			System.out.println("entered Add Item service");
			dao.AddItem();
		}
}
