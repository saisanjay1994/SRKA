package com.srka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.srka.dto.UserTO;

public class UserDAO {
	Connection conn;
	ConnectionBroker cb;
	PreparedStatement pstmt;
	ResultSet rs;
	String query1="insert into srka.user_details(username,password)values(?,?)";
	String query2="select * from srka.user_details where username=?";
	String query3="select password from srka.user_details where username=?";
	String query4="insert into srka.inventory(item_name,item_value,item_unit,username)values(?,?,?,?)";
	static UserTO to;
	static UserDAO dao=null;
	private UserDAO() {
		super();
		cb = new ConnectionBroker();
		conn = (Connection)ConnectionBroker.getInstance();
		to = UserTO.getInstanceTO();
		System.out.println(to);
		}
	public void Register() {
		try {
			System.out.println("inside register in User DAO");
			pstmt = conn.prepareStatement(query1);
			pstmt.setString(1,to.getusername());
			System.out.println(to.getusername());
			pstmt.setString(2,to.getpassword());
			System.out.println(to.getpassword());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public boolean CheckUser() {
			try {
				System.out.println("inside CheckUser in User DAO");
				pstmt = conn.prepareStatement(query2);
				pstmt.setString(1,to.getusername());
				System.out.println(to.getusername());
				rs=pstmt.executeQuery();
					if(rs.next())
					{
						System.out.println("Inside Username already taken");
						return true; //True means username already taken
					}
				return false; //False means username available

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return true;
			}
		}
		public String CheckPassword() {
			String passwordDB=null;
			try {
				System.out.println("inside CheckPassword in User DAO");
				pstmt = conn.prepareStatement(query3);
				pstmt.setString(1,to.getusername());
				System.out.println(to.getusername());
				rs=pstmt.executeQuery();
					if(rs.next())
					{
						System.out.println("Inside Password Checking Comparison");
						System.out.println(rs.getObject(1));
						passwordDB = rs.getString(1);
						System.out.println("Password in DB");
						System.out.println(passwordDB);
						System.out.println("Password entered by user");
						System.out.println(to.getpassword());
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			return passwordDB;
		}
		
		public void AddItem() {
			try {
				System.out.println("inside AddItem in User DAO");
				pstmt = conn.prepareStatement(query4);
				pstmt.setString(1,to.getAddItemName());
				System.out.println(to.getAddItemName());
				pstmt.setString(2,to.getAddItemValue());
				System.out.println(to.getAddItemValue());
				pstmt.setString(3,to.getAddItemUnit());
				System.out.println(to.getAddItemUnit());
				pstmt.setString(4,to.getusername());
				System.out.println(to.getusername());
				pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
public static UserDAO getInstance()
{
	if(dao == null)
	{
		dao= new UserDAO();
	}
	return dao;
}
}
