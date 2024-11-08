package com.work2win.ikm;

public class SampleInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer x = 3;
		Integer y = null;
		
		System.out.println(Integer.compareUnsigned(x, 3) == 0 || Integer.compareUnsigned(y, 0)==0);
		try {
			System.out.println(y.compareTo(null)==0 || true);
		}catch(Exception e) {System.out.println(e.getClass().toString());}
	}

}
