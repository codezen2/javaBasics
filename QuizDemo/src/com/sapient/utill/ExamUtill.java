package com.sapient.utill;

import java.util.HashSet;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;

public class ExamUtill {
		public static final String DRIVER;
		public static final String URL;
		public static final String UNAME;
		public static final String PWD;
		static
		{
			ResourceBundle rs=ResourceBundle.getBundle("sap");
			DRIVER=rs.getString("driver");
			URL=rs.getString("url");
			UNAME=rs.getString("uname");
			PWD=rs.getString("pwd");
		}
	
		public static Set<Integer> generateUniqueNos(int number, int totalset) {
			Set<Integer> set = new HashSet<Integer>();
			Random r = new Random();
			while (set.size() < number)
				set.add(r.nextInt(totalset) + 1);
			return set;

		}
}
