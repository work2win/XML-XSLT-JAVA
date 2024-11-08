package com.work2win.ikm;

import java.lang.StringBuilder;
import java.util.Formatter;
import java.util.StringJoiner;

public class SampleStringbuilder {
	
	public static void main(String[] args) {
		
		Runnable r = () -> System.out.println("HI************");
		new Thread().start();
		
		String stringA = "A";
		String stringB = "B";
		String stringnull = null;
		
		StringBuilder buggerc = new StringBuilder("C");
		Formatter fmt = new Formatter(buggerc);
		
		fmt.format("%s%s", stringA, stringB);
		System.out.println("Line 1:" +fmt);
		
		fmt.format("%-2s",stringB);
		System.out.println("Line 2:"+fmt);
		
		fmt.format("%b", stringnull);
		System.out.println("Line3:" +fmt);
		
		
		
		StringBuilder stringBuilder = new StringBuilder("Welcome everybody");		
		System.out.println(stringBuilder);
		
		StringJoiner joiner = new StringJoiner(" ", "H", "?");
		System.out.println(joiner);
		
		stringBuilder.replace(0, 7, "simi");
		stringBuilder.setCharAt(8, 'X');
		
		joiner.add("add joiner").add(stringBuilder);
		
		System.out.println(stringBuilder);
		System.out.println(joiner);
	}

}
