package com.work2win.ikm;

import java.util.HashMap;
import java.util.Map;

public class SampleHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		additionMeth();

	}
	
	public static void additionMeth() {
		Map<Integer, Integer> m = new HashMap<>();
		Integer key = 5;
		Integer value = key;
		
		m.put(500, 500);		
		m.put(key++, value);
		
		System.out.println(m.values());
		
	}
	

}
