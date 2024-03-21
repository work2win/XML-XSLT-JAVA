package com.work2win.java11;

public class StringAPISample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World";
		String input = "\nHello World \u2005";
		
		//the repeat() instance method repeats the string content.
		System.out.println(str.repeat(2));
		
		//The strip() instance method returns a string with all leading and trailing whitespaces removed.
		System.out.println(input.strip());
		
	}

}
