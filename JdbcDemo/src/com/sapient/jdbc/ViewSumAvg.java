package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewSumAvg {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the Id value to find");
//		int nid=scan.nextInt();
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//String url="jdbc:oracle:thin:@10.151.60.206:1521:xe";
		String url="jdbc:oracle:thin:@localhost:1521:xe"; //for same pc
		Connection conn=DriverManager.getConnection(url,"system","sapient123");
		//String sql="select * from sap_emp";
		
		String sql="select count(eid) Count , sum(sal) TotalSalary, avg(sal) Average from sap_emp";
		PreparedStatement st= conn.prepareStatement(sql);

//		st.setDouble(1,nid); // sets value in prepared statement
		ResultSet rs=st.executeQuery();
		
		System.out.printf("%10s%20s%20s","Count","Total Salary","Average");
		System.out.println("\n_______________________________________________________________________________");
		while(rs.next())
		{
			int no=rs.getInt("Count");
			double sum=rs.getDouble("TotalSalary");
			double avg=rs.getDouble("Average");
		System.out.printf("\n%10d%20.2f%20.2f",no,sum,avg);
		}
		System.out.println("\n______________________________________________________________________________");

		conn.close();
		scan.close();
	}
}
