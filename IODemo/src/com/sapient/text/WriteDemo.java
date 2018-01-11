package com.sapient.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		Scanner scan =new Scanner(System.in);
		FileWriter fw= new FileWriter("sap.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Sapient RazorFish Campus Training\nHeld in Gurgoan");
		bw.write("\nSapient RazorFish Clients are Audi, Ferrari");
		bw.close();
		fw.close();
		scan.close();
		System.out.println("File Created"); // always overwrites

	}

}
