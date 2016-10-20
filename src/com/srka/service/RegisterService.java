package com.srka.service;
import com.srka.dao.UserDAO;

public class RegisterService {
UserDAO dao;
public RegisterService() {
	super();
	dao = UserDAO.getInstance();
}
	public void Register()
	{
		System.out.println("entered Register service");
		dao.Register();
	}

}
