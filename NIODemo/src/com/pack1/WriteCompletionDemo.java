package com.pack1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class WriteCompletionDemo {

	public static void main(String[] args) throws IOException{
		Path path = Paths.get("future-write2.txt");
		if(!Files.exists(path)){
		    Files.createFile(path);
		}
		AsynchronousFileChannel fileChannel = 
		    AsynchronousFileChannel.open(path, StandardOpenOption.WRITE);

		ByteBuffer buffer = ByteBuffer.allocate(1024);
		long position = 0;

		buffer.put("ram is great\nraj\nravi\n".getBytes());
		buffer.flip();

		fileChannel.write(buffer, position, buffer, new CompletionHandler<Integer, ByteBuffer>() {

		    @Override
		    public void completed(Integer result, ByteBuffer attachment) {
		        System.out.println("bytes written: " + result);
		    }

		    @Override
		    public void failed(Throwable exc, ByteBuffer attachment) {
		        System.out.println("Write failed");
		        exc.printStackTrace();
		    }
		});
		System.out.println("line1");
	}
}
