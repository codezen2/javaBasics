package com.sapient.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class AppendDemo {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee id");
		int eid = scan.nextInt();
		System.out.println("Enter employee name");
		String name = scan.next();
		System.out.println("enter the salary");
		double sal = scan.nextDouble();
		
		FileOutputStream fos = new FileOutputStream("employee.txt",true);
		//we are not using object output stream, we are using appendableObjectStream
		AppendableObjectStream oos = new AppendableObjectStream(fos);
		Emp emp = new Emp(eid, name, sal);
	
		oos.writeObject(emp);
		oos.close();
		fos.close();
		System.out.println("java object appended");

	}

}
