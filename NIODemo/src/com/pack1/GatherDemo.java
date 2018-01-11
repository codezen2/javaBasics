package com.pack1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;

public class GatherDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("sap3.txt");
		FileChannel fc = fos.getChannel();
		ByteBuffer buffer1 = ByteBuffer.allocate(8);
		ByteBuffer buffer2 = ByteBuffer.allocate(48);  
		
		IntBuffer ibuff = buffer1.asIntBuffer();
		ibuff.put(45);
		CharBuffer cbuff = buffer2.asCharBuffer();
		cbuff.put("ram is great");
		
		GatheringByteChannel gc = fos.getChannel();
		gc.write(new ByteBuffer[]{buffer1, buffer2});
		gc.close();
		System.out.println("file created");
		
		
	}

}
