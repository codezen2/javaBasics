package com.sapient.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EmpFileDao implements Idao {
	public EmpFileDao() {
		// instance not to be created in any other package
	}

	@Override
	public List<String> viewEmployee() {
		System.out.println("EmpFileDao Instance");
		List<String> lst = new ArrayList<String>();
		String str=null;
		try {
			FileReader fr= new FileReader("emp.txt");// reading a file
			BufferedReader br=new BufferedReader(fr);// read line by line
			while((str=br.readLine())!=null) // returns null when no data
			{
				lst.add(str);
			}
			br.close(); 
			fr.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lst;
	}

}
