package com.pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ScatteringByteChannel;

public class ScatterDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("sap3.txt");
		ScatteringByteChannel fc = fis.getChannel();
		ByteBuffer buffer1 = ByteBuffer.allocate(8);
		ByteBuffer buffer2 = ByteBuffer.allocate(48);

		fc.read(new ByteBuffer[] { buffer1, buffer2 });
		buffer1.rewind();
		buffer2.rewind();

		int bufferOne = buffer1.asIntBuffer().get();
		String bufferTwo = buffer2.asCharBuffer().toString();
		
		System.out.println(bufferOne);
		System.out.println(bufferTwo);

	}

}
