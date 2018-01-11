package com.sapient.serial;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialzeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp emp=null;
		try{
			while(true)
			{
				emp=(Emp)ois.readObject();
				System.out.println(emp);
			}
		}catch(EOFException ex)
		{
			System.out.println("End Of File");
		}
		ois.close();
		fis.close();
	}

}
