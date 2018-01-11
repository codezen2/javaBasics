package com.pack1;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadCompletionDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		Path path = Paths.get("future-write2.txt");
		AsynchronousFileChannel fileChannel = 
			    AsynchronousFileChannel.open(path, StandardOpenOption.READ);
		
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		long position = 0;
		fileChannel.read(buffer, position, buffer, new CompletionHandler<Integer, ByteBuffer>() {
		    @Override
		    public void completed(Integer result, ByteBuffer attachment) {
		        System.out.println("result = " + result);

		        attachment.flip();
		        byte[] data = new byte[attachment.limit()];
		        attachment.get(data);
		        System.out.println(new String(data));
		        attachment.clear();
		    }

		    @Override
		    public void failed(Throwable exc, ByteBuffer attachment) {
		    	System.out.println(exc.getMessage());
		    }
		});
		
		System.out.println("read over");
		Thread.sleep(1000);

	}
	
	
}
