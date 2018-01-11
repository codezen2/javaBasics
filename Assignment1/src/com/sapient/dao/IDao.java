package com.sapient.dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.sapient.exception.IdException;
import com.sapient.exception.NotfoundException;
import com.sapient.vo.Emp;

public interface IDao {
	List<Emp> viewEmployee() throws SQLException, ParseException;
	Emp viewEmployee(int eid) throws NotfoundException, ParseException, SQLException;
	int addEmployee(Emp emp) throws IdException, SQLException;
	int removeEmployee(int eid) throws NotfoundException, SQLException;
	int updateEmployee(int eid, double sal)throws NotfoundException, SQLException;
	//view all dept names
	//
}
