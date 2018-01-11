package com.pack1;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;

public class ReadableFutureDemo {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("sap4.txt");
		AsynchronousFileChannel fileChannel = 
			    AsynchronousFileChannel.open(path, StandardOpenOption.READ);

			ByteBuffer buffer = ByteBuffer.allocate(1024);
			long position = 0;

			Future<Integer> operation = fileChannel.read(buffer, position);

			while(!operation.isDone());

			buffer.flip();
			byte[] data = new byte[buffer.limit()];
			buffer.get(data);
			System.out.println(new String(data));
			buffer.clear();

	}

}
