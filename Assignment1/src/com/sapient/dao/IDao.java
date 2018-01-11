package com.sapient.dao;

import java.util.List;

import com.sapient.exception.IdException;
import com.sapient.exception.NotfoundException;
import com.sapient.vo.Emp;

public interface IDao {
	List<Emp> viewEmployee();
	Emp viewEmployee(int eid) throws NotfoundException;
	int addEmployee(Emp emp) throws IdException;
	int removeEmployee(int eid) throws NotfoundException;
	int updateEmployee(int eid, double sal)throws NotfoundException;
	//view all dept names
	//
}
