package com.work2win.java11;


interface StringMeth {
    String add(String left, String right);
}



public class SampleLamda11 {
	
	
public static void main(String args[]) {
	 
	StringMeth s = (left, right) -> left + right;
	String op = s.add("hello", "world");
	System.out.println(op);
}

}
