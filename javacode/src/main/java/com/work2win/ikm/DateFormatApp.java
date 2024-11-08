package com.work2win.ikm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;
//import java.lang.CheckedException;
public class DateFormatApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate localdate = LocalDate.of(2015, 4,4);
		System.out.println(localdate.format(DateTimeFormatter.ofPattern("MMM dd, YYYY")));
		System.out.println(localdate.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy")));
		System.out.println(localdate.format(DateTimeFormatter.ofPattern("MM/dd/yy")));
		
		System.out.println(Stream.of("green", "yellow", "blue").max((s1,s2) -> s1.compareTo(s2)).filter(s-> s.endsWith("n")).orElse("yellow"));

	}

}
