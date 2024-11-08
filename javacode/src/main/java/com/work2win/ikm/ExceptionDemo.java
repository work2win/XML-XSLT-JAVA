package com.work2win.ikm;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExceptionDemo {
	
	static int number2 = getValue();
	static int number1 = 10;
	static int getValue() {
		return number1;
	}
	
	static int doSum() {
		return number1+number2;
	}
	static int dominus() {
		return number1-number2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = null;
		Optional<String> b = Optional.empty();
		
		System.out.println("Number1 + Number2 = "+doSum());
		System.out.println("Number1 - Number2 = "+dominus());
		try {
			System.out.print(a.length());
			System.out.print(b.orElse("").length());
			
		}catch(Exception e) {
			System.out.print(a);
		}
		finally {
			a = "String";
			System.out.print(a.length());
			b = Optional.ofNullable("");
			System.out.print(b.get().length());
		}
		
		
		
		List<String> list = Arrays.asList("dog", "over","good");
		
		System.out.println(list.stream().reduce(new String(), (x1,x2)-> {if (x1.equals("dog")) return x1;return x2;}));
		
		//System.out.println(list.stream().reduce(new String(), (s1,s2)-> );
				
	

	}

}
