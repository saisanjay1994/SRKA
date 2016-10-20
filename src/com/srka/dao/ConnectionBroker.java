package com.srka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionBroker {
	private static Connection conn = null;
	/*private static ConnectionBroker cb = null;
	public static ConnectionBroker getInstance(){
		if(cb == null)
			cb = new ConnectionBroker();
		return cb;
		
	}*/

	private static Connection estConnection(){
		
		ReadProperties rp = new ReadProperties();
		Properties prop = rp.getProperty();
		String driver=prop.getProperty("driver");
		String url=prop.getProperty("url");
		String  login=prop.getProperty("login");
		String password=prop.getProperty("password");

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, login, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public static Connection getInstance(){
		if(conn == null)
			conn = estConnection();
		return conn;
		
	}

}

