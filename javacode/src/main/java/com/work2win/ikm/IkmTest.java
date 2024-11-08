package com.work2win.ikm;

public class IkmTest {
	
	public static void main(String[] args) {
		System.out.println(calc(5));
		
		int i=2;
		int j=0;
		
		j = (i++ + i++)*--i;
		System.out.println(j);
	}
	
	public static int calc(int x) {
		if(x==0)
			return 1;
		else
			return x*calc(x-1);
	}

}
