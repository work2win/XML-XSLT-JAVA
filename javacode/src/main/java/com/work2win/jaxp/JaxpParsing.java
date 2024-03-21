package com.work2win.jaxp;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class JaxpParsing {
	
	
	
	public static void main(String[] args) {
		

		String workingDir = System.getProperty("user.dir");
		System.out.println("Current working directory : " + workingDir);
		
		File file = new File(workingDir, "file.xml"); 
		String absolutePath = file.getAbsolutePath();
		System.out.println("File path : " + absolutePath);
		
		try {
			
		InputStream ins = new FileInputStream(file);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();	    
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		Document doc = dBuilder.parse(ins);
		doc.getDocumentElement().normalize();
		
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
