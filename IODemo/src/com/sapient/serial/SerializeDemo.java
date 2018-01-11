package com.sapient.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeDemo extends ObjectOutputStream {

	protected SerializeDemo() throws IOException, SecurityException {
		super();
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		// TODO Auto-generated method stub
		reset();
	}

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		// FileOutputStream fos=new FileOutputStream("employee.txt");
		FileOutputStream fos = new FileOutputStream("employee.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// System.out.println("Enter Employee Id");
		// int id= scan.nextInt();
		// System.out.println("Enter the Employee Name");
		// String name=scan.next();
		// System.out.println("Enter the salary");
		// double sal=scan.nextDouble();
		//
		// SerializeDemo oos=new SerializeDemo();
		// Emp emp=new Emp(id,name,sal);
		Emp emp = new Emp(1102, "Mohan", 10000);
		Emp emp1 = new Emp(1103, "manoj", 3000);
		Emp emp2 = new Emp(1001, "tom", 21330);

		oos.writeObject(emp);// send obj to file
		oos.writeObject(emp1);// send obj to file
		oos.writeObject(emp2);// send obj to file

		oos.close();
		fos.close();
		System.out.println("Writing completed");

	}

}
