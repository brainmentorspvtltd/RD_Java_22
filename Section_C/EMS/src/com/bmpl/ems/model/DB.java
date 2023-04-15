package com.bmpl.ems.model;

import java.util.Date;

import com.bmpl.ems.views.Emp;

public class DB {
	public Message checkLogin(String id, String pwd) {
		//String msg = "";
		Message msg = new Message();
		if(id.equals("101") && pwd.equals("1234")) {
			//msg = "Login Success";
			msg.setMsg("Login Success...");
		}
		else {
			//msg = "Login Failed";
			msg.setMsg("Login Failed...");
		}
		msg.setDate(new Date());
		msg.setId(id);
		return msg;
	}
	
	public void doRegister(Emp emp) {
		
	}
}
