package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmpSal {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // for same pc
		Connection conn = DriverManager.getConnection(url, "system", "sapient123");
		//String sql = "update sap_emp set sal=sal*?";

		String sql = "update sap_emp set sal=? where eid=?";
		PreparedStatement st = conn.prepareStatement(sql);
//		System.out.println("Enter the Salary percent update");
//		double sal = scan.nextDouble();
//		st.setDouble(1, (1 + sal));
		System.out.println("Enter the Id to Insert");
		int id=scan.nextInt();
		System.out.println("Enter the Salary update");
		double sal = scan.nextDouble();
		st.setDouble(2, id);
		st.setDouble(1, sal);
		int rows = st.executeUpdate();
		System.out.println("\n_______________________________________________________________________________");
		System.out.println(rows + " Rows Affected");
		conn.close();
		scan.close();
	}
}
