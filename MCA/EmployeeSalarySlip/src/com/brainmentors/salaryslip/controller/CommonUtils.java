package com.brainmentors.salaryslip.controller;

public class CommonUtils {
	
	public String capitalize(String name) {
		//name = "rAmaN";
		// r
		char firstChar = name.charAt(0);
		String firstLetter = String.valueOf(firstChar).toUpperCase();
		// R
		
		// AmaN
		String remName = name.substring(1).toLowerCase();
		// aman
		name = firstLetter + remName;		
		return name;
	}
	
	public String formatName(String name) {
		//name = "RaM kuMAr ShARMa"
		String fullName = "";

		// {"RaM", "kuMAr", "ShARMa"}
		String nameArr[] = name.split(" ");
		
		for(String word : nameArr) {
			fullName += capitalize(word) + " ";
		}
		
		//fullName = "Ram Kumar Sharma"
		return fullName;
	}
}
