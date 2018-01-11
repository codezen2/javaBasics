package com.sapient.text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("sap.txt");
	//	BufferedReader br = new BufferedReader(fr);
		//comfigrable
		BufferedReader br = new BufferedReader(fr,2*1024*1024);

		String str = null;
		int c=0;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
			c++;
		}
		br.close();
		fr.close();
		System.out.println("____No of lines:"+c);
	}

}
