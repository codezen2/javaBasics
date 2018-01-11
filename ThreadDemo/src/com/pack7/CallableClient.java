package com.pack7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableClient {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService pool=Executors.newCachedThreadPool();//based on demand 
		MyCallable c1=new MyCallable();
		Future<Integer> future=pool.submit(c1);
		System.out.println("Main Line1");
		System.out.println("Main Line2");
		System.out.println("Main Line3");
		for(int i=0;i<100;++i)
		{
			System.out.println("Main Thread "+ i);
		}
		int res=future.get();
		System.out.println("SUM= "+res);
	}

}
