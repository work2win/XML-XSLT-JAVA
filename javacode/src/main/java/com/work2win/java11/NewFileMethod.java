package com.work2win.java11;

import java.io.File;


public class NewFileMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		try {
			
			File sampleFile = File.createTempFile("file is",null);	
			if(sampleFile.exists()) {
				System.out.println("file created"+sampleFile.getName());
			}else {
				System.out.println("not created");
			}
			
		
		}catch(Exception e) {
			
		}
		

	}

}
