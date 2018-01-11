package com.sapient.arr;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		String[] arr = { "ram", "shyam", "peter", "birbal", "kumar", "amit" };
		Arrays.sort(arr);
		// returns a string with all the elements
		System.out.println(Arrays.toString(arr));

		// returns length
		System.out.println("length: "+arr.length); 
		
	//Finding string		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String to Find");
		String s=scan.next();
	
		int res=Arrays.binarySearch(arr,s); // returns position else -1
		if(res>=0)
		{
			System.out.println("Found at Index "+res+" "+arr[res]);
		}else
		{
			System.out.println("Not Found");
		}
	}

}
