package com.pack2;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=1000;++i)
		{
			System.out.println(Thread.currentThread().getName()+" "+(i*5));
		}
	}

}
