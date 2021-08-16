package com.orange.classes;

public class SuperRadio {
	static String company = "LG";
	static String modelName = "LG_G77";
	static String pInfo;
	
	static {
		company = "SAMSUNG";
		pInfo = company + ":" +modelName;
	}
}
