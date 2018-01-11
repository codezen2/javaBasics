package com.sapient.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Demo3 {

	public static void main(String[] args) {
		String str = null;
		//automaticly resource management
		try (BufferedReader br = new BufferedReader(new FileReader("sap.txt"))) {
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}

}
