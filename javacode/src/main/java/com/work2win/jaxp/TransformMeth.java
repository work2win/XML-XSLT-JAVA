package com.work2win.jaxp;



import java.io.File;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class TransformMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 3) 
			{
		    System.exit(1);
		    }
		    // Create a transformer object
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		    Transformer tx;
			try {
				tx = TransformerFactory.newInstance( ).newTransformer(
				new StreamSource(new File(args[1])));
			
		    
				tx.transform(
				new StreamSource(new File(args[0])),
				new StreamResult(new File(args[2])));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("exception");
				e.printStackTrace();
			}
		}
}


