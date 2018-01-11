package com.props;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropsDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties props=new Properties();
		//add prop to object
		props.put("1001", "ram");
		props.put("1002", "tom");		
		//load from file
		props.load(new FileReader("src\\sap.properties"));
		
		// seeing output
		System.out.println(props.getProperty("uname"));
		System.out.println(props.getProperty("1001"));
		System.out.println("size: "+props.size());
		System.out.println(props.getProperty("pwd"));
		
	}

}
