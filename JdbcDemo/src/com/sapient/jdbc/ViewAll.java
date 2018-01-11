package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;

public class ViewAll {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//String url="jdbc:oracle:thin:@10.151.60.206:1521:xe";
		String url="jdbc:oracle:thin:@localhost:1521:xe"; //for same pc
		Connection conn=DriverManager.getConnection(url,"system","sapient123");
		String sql="select * from sap_emp";
		
		PreparedStatement st= conn.prepareStatement(sql);
		ResultSet rs=st.executeQuery();
		
		System.out.printf("%10s%20s%20s%10s%20s","ID","Name","SAL","DID","DOJ");
		System.out.println("\n_______________________________________________________________________________");
		while(rs.next())
		{
			int id=rs.getInt("EID");
			String name=rs.getString("ename");
			double sal=rs.getDouble("sal");
			int did=rs.getInt("dept_id");
			String doj=rs.getString("doj");
			//System.out.println(id+" "+name+" "+sal+" "+did);
			System.out.printf("\n%10d%20s%20.2f%10d%20s",id,name,sal,did,doj);

		}
		System.out.println("\n______________________________________________________________________________");

		conn.close();
	}

}
