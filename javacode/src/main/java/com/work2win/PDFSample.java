package com.work2win;

import java.io.IOException;  
import org.apache.pdfbox.pdmodel.PDDocument;  
import org.apache.pdfbox.pdmodel.PDPage;  
public class PDFSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		PDDocument pDDocument = new PDDocument();
		pDDocument.addPage(new PDPage());
		
		//this will create in the directory mentioned. if it throws exception make sure the drive has the permission to create one.
		pDDocument.save("C:\\Users\\simu\\Desktop\\temp\\sample.pdf");
		System.out.println("pdf created");
		pDDocument.close();

	}

}
