package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner scan=new Scanner(System.in);
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe"; //for same pc
		Connection conn=DriverManager.getConnection(url,"system","sapient123");
		
		String sql="insert into sap_emp values(?,?,?,?,?)";
		PreparedStatement st= conn.prepareStatement(sql);
		System.out.println("Enter the Id");
		int id=scan.nextInt();
		System.out.println("Enter the Name");
		String name=scan.next();
		System.out.println("Enter the Salary");
		double sal=scan.nextDouble();
		System.out.println("Enter the Dept id");
		int did=scan.nextInt();
	//system.getdate
		Date d=new Date(System.currentTimeMillis());
		
		st.setInt(1, id);
		st.setString(2, name);
		st.setDouble(3, sal);
		st.setInt(4, did);
		//st.setString(5, "10-dec-2012");
		st.setDate(5, d);

		int rows=st.executeUpdate();
				
		System.out.println("\n_______________________________________________________________________________");
		System.out.println(rows+" Rows Affected");
		conn.close();
		scan.close();
	}
}
