package com.work2win.ikm;

import java.util.HashMap;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> h = new HashMap<String, String>();
		h.put("operationmode", "agent");
		
		System.getProperties().setProperty("operationmode", "agent");
	}

}
