package com.bmpl.ems.controller;

import com.bmpl.ems.model.DB;
import com.bmpl.ems.model.Message;
import com.bmpl.ems.views.Emp;

public class RegisterController {
	public void regReq(Emp obj) {
		DB db = new DB();
		db.doRegister(obj);
		//return msg;
	}
}
