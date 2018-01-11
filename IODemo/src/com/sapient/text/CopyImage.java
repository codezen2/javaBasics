package com.sapient.text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("Penguins.jpg");
		FileOutputStream fos=new FileOutputStream("sapimage.jpg");
		byte[] data=new byte[fis.available()];
		fis.read(data);
		fos.write(data);		
		fos.close();
		fis.close();
		System.out.println("Image Copied");
		
	}

}
