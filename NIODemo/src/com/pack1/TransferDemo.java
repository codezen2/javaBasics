package com.pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class TransferDemo {

	public static void main(String[] args) throws IOException {
		
//		RandomAccessFile fromFile = new RandomAccessFile("sap1.txt", "rw");
//		FileChannel      fromChannel = fromFile.getChannel();
//
//		RandomAccessFile toFile = new RandomAccessFile("sap2.txt", "rw");
//		FileChannel      toChannel = toFile.getChannel();

		FileInputStream fis=new FileInputStream("sap1.txt");
		FileChannel      fromChannel = fis.getChannel();
		
		FileOutputStream fos=new FileOutputStream("sap2.txt");
		FileChannel      toChannel = fos.getChannel();
		long position = 0;
		long count    = fromChannel.size();

		//toChannel.transferFrom(fromChannel, position, count);
		fromChannel.transferTo(position, count, toChannel);
		System.out.println("file copied");

	}

}
