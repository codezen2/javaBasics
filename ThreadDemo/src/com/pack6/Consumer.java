package com.pack6;

public class Consumer extends Thread {


	private Que que;
	public Consumer(Que que)
	{
		this.que=que;
		
	}
	public void run()
	{
		int i=1;
		while(i<=5)
		{
			que.get();
			++i;
		}
		
	}
}
