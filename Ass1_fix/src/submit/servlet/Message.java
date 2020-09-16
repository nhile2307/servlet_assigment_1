package submit.servlet;

import java.util.*;

public class Message {
	//1. Attributes
	private String name;
	private String mess;
	private String date;
	
	// 2. Constructors
	public Message(String name, String mess, String date) {
		this.name = name;
		this.mess = mess;
		this.date = date;
	}
	//3. Get set methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMess() {
		return mess;
	}
	public void setMess(String mess) {
		this.mess = mess;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	//4.methods
	public String printOut() {
		return "Name: " + this.name + "<br>" +
						 "Message: " + this.mess + "<br>" + 
						 "Date: " + this.date + "<br>" + 
						  "=============" + "<br>" ; 
	}
}
