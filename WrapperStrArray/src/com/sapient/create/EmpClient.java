package com.sapient.create;

public class EmpClient {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	Class cls=Class.forName("com.sapient.create.Emp"); //Class is a java class itself
	Emp emp = (Emp)cls.newInstance();//creating instance for class name provided at run time.
	emp.display();
	}

}
