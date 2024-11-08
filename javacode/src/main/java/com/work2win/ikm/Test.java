package com.work2win.ikm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Map<List<Integer>, List<String>>> officeparam = new ArrayList<>();
		Map<List<Integer>, List<String>> offc = new HashMap<>();
		officeparam.add(null);
		officeparam.add(offc);
		officeparam.add(new HashMap<List<Integer>, List<String>>());
		officeparam.forEach(e -> System.out.print(e + " "));
		

	}

}
