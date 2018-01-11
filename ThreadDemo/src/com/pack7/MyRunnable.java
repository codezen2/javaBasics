package com.pack7;

public class MyRunnable implements Runnable{

	private String name;
	
	
	public MyRunnable(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		for(int i=0;i<=500;++i)
		{
			System.out.println(name+" Executing");
		}
		System.out.println(name+" Completed\n___________________________________________________________________");
	}

}
