package com.work2win;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class IkmTest {
	
	private int data;

	public IkmTest() {
		//this(10);
	}
	
	public void display() {
		class Decrement {
			public void decrement() {
				data--;
			}
			
		}
		
		Decrement d = new Decrement();
		d.decrement();
		System.out.println("data"+data);
	}
	
	void displays() {
		System.out.println("data"+data);
		int data;
	}

	public IkmTest(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public static void main(String[] args) {
		int data = 0;
		LocalDate localdate = LocalDate.of(2014,4,4);
		Integer x = 3;
		Integer y = null;
		System.out.println(Integer.compareUnsigned(x, 3) == 0 || Integer.compareUnsigned(y, 0)==0);
		try {
			System.out.println(y.compareTo(null)==0 || true);
		}catch(Exception e) {System.out.println(e.getClass().toString());}
		
		String first = "first";
		String second = new String("first");
		"first".concat("second");
		System.out.println("gg"+first.equals(second));
		System.out.println(first == second);
		System.out.println("gg"+first.equals("firstsecond"));
		System.out.println(second == "first");
		
		boolean b = false;
		int n=5;
		System.out.println("jjjjjjjj");
		System.out.println(b||n==5);
		System.out.println(b=true && n==5);
		System.out.println(b||n==5);
		System.out.println(b);
		//System.out.println(localdate.format(DateTimeFormatter.ofPattern("mm/dd/yy")));
		IkmTest t = new IkmTest();
		t.display();
		System.out.println(data);
		
		int xx=0;
		IkmTest tt = new IkmTest();
		tt.displays();
		
		Map<Integer, Integer> countmap = new HashMap<>();
		Integer key = 5;
		Integer value = key;
		countmap.put(300,300);
		countmap.put(key++,value);
		System.out.println(countmap.values());
		int count = 0;
		for(Integer i: countmap.keySet()) {
			
		}
		System.out.println(count);
		
		StringBuilder builder = new StringBuilder("Welcome everybody");
		StringJoiner f = new StringJoiner(" ","H","?");
		builder.replace(0,7,"elcome");
		builder.setCharAt(7, '!');
		f.add("ello and").add(builder);
		System.out.println(f.toString());
		
	}
}
