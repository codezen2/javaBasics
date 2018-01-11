package com.pack6;

import java.util.Scanner;

public class Producer extends Thread
{
	private static Scanner scan = new Scanner(System.in);
		private Que que;
		
		public Producer(Que que)
		{
			this.que=que;
			
		}
		
	public void run()
	{
		int i=1;
		while(i<=5)
		{
			System.out.println("Enter Data");
			String str = scan.next();
			que.put( str);
			++i;
		}
		
		
	}
}