package com.sapient.str;

public class StringBufferDemo {

	public static void main(String[] args) {
		String str = "Sapient Nitro is Razorfish";
		StringBuffer sb = new StringBuffer(str);// convert string to string buffer
		System.out.println(sb);
		System.out.println(sb.length());
		sb.append(" Indian operations started");
		System.out.println(sb);// buffer gets changed
		sb.insert(26, ". In 2000,");// inserts after no of chartrs
		System.out.println(sb);
		sb.replace(26, 31, " Now, The ");// replaces value
		System.out.println(sb);
		sb.delete(30, sb.length()); // delete string after 26th char
		System.out.println(sb);
		String str2=sb.toString();//convert back to string
		System.out.println(str2);
		StringBuffer name1=new StringBuffer("rama");
		name1.reverse();
		System.out.println(name1);
		name1.append(" Kumar");
		System.out.println(name1);
		System.out.println(name1.substring(6,9));
		System.out.println(name1.charAt(2));
		System.out.println(name1.indexOf("m"));
	}

}
