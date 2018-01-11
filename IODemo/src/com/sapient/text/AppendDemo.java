package com.sapient.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendDemo {

	public static void main(String[] args) throws IOException {
		Scanner scan =new Scanner(System.in);
		FileWriter fw= new FileWriter("sap.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("\nCondor is celebarting Chritmas");
		bw.write("\nNext Assesment is on 4th Jan 2018");
		bw.close();
		fw.close();
		scan.close();
		System.out.println("Apended File"); // 2nd Argument isdefalut false
	}

}
