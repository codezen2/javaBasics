package com.sapient.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Emp3dbcDao implements Idao {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<String> viewEmployee() {
		System.out.println("JDBC DAO");
		List<String> lst = new ArrayList<String>();
		Connection conn = null;
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // for same pc
			conn = DriverManager.getConnection(url, "system", "sapient123");
			String sql = "select ename from sap_emp";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				lst.add(rs.getString("ename"));
			}

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			closeConn(conn);
		}
		return lst;
	}

	public void closeConn(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
