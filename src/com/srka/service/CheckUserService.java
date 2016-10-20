package com.srka.service;

import com.srka.dao.UserDAO;

public class CheckUserService {
	UserDAO dao;
	public CheckUserService() {
		super();
		dao = UserDAO.getInstance();
	}
		public boolean CheckUser()
		{
			System.out.println("entered CheckUser service");
			boolean cs=dao.CheckUser();
			if(cs)
				return true; //Username taken
			return false; //Username available
	}
}
