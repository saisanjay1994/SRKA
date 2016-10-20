package com.srka.dto;



public class UserTO {
	String username;
	String password;
	String itemName;
	String itemValue;
	String itemUnit;
	
	static UserTO to = null;
	
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
//	
	public String getAddItemName() {
		return itemName;
	}
	public void setAddItemName(String itemName) {
		this.itemName = itemName;
	}
//	
	public String getAddItemValue() {
		return itemValue;
	}
	public void setAddItemValue(String itemValue) {
		this.itemValue = itemValue;
	}
//
	public String getAddItemUnit() {
		return itemUnit;
	}
	public void setAddItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
//
	public static UserTO getInstanceTO(){
		if(to==null)
		to=new UserTO();
	 return to;
	}
}
