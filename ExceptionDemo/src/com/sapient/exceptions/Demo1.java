package com.sapient.exceptions;

public class Demo1 {

	public static void main(String[] args) {
			System.out.println("Line1");
			System.out.println("Line2");
			try{
			int a=5/0;
			System.out.println("TRY BLOCK"+a);
			}catch(ArithmeticException ex)
			{
				System.out.println("Catch Block");
				System.out.println(ex.getMessage());
				System.exit(0);//stops the code and exits application
				ex.printStackTrace();//complete info what why and where in msg
			}finally {
				System.out.println("lets chill");
			}
			System.out.println("Line3");
			System.out.println("Line4");
			System.out.println("Line5");
			System.out.println("Line6");
			System.out.println("Line7");

	}

}
