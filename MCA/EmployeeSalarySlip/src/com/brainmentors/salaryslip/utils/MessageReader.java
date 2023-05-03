package com.brainmentors.salaryslip.utils;

import java.util.ResourceBundle;

public class MessageReader {
	/*
	 * ResourceBundle class will be used to read
	 * .properties file
	 */
	ResourceBundle rb;
	public MessageReader() {
		// in getBundle method we pass only file name
		// we don't pass extension of file
		// because file will be .properties always
		rb = ResourceBundle.getBundle("messages");
	}
	
	public String getValue(String key) {
		return rb.getString(key);
	}
	
}
