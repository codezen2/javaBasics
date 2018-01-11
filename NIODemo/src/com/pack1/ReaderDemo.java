package com.pack1;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReaderDemo {
	     
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("sap1.txt");
		FileChannel fc=fis.getChannel();
		ByteBuffer buff=ByteBuffer.allocate(10);
		
		while(fc.read(buff) !=-1)
		{
			buff.flip();
			while(buff.hasRemaining())
				System.out.print((char)buff.get());
			buff.clear();
			buff.rewind();
		}
		
	}

}
