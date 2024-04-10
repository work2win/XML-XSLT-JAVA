package com.work2win;

import java.util.LinkedList;

public class SampleLinkedList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);
		
		LinkedList<Integer> rl = new LinkedList<Integer>();
		for(int i=4;i>=0;i--) {
			rl.add(l.get(i));			
		}
		System.out.println(rl);
	}


}
