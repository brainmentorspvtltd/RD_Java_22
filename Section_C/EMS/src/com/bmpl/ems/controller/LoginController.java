package com.bmpl.ems.controller;

import com.bmpl.ems.model.DB;
import com.bmpl.ems.model.Message;

public class LoginController {
	public Message loginReq(String id, String pwd) {
		DB db = new DB();
		Message msg = db.checkLogin(id, pwd);
		return msg;
	}
}
