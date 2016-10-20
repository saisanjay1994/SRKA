package com.srka.service;

import com.srka.dao.UserDAO;

public class CheckPasswordService {
	UserDAO dao;
	public CheckPasswordService() {
		super();
		dao = UserDAO.getInstance();
	}
	public boolean CheckPassword(String password)
	{
		System.out.println("entered CheckPassword service");
		String passwordDB=dao.CheckPassword();
		if(passwordDB.equals(password))
			return true; //Password Match
		return false; //Password Mismatch available
	}
}
