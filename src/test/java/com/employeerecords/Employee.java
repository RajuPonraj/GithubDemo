package com.employeerecords;
public class Employee {
	
	
	    private int empNumber;
	    private String empName;

	    public Employee(int empNumber, String empName) {
	        this.empNumber = empNumber;
	        this.empName = empName;
	    }

	    public int getEmpNumber() {
	        return empNumber;
	    }

	    public void setEmpNumber(int empNumber) {
	        this.empNumber = empNumber;
	    }

	    public String getEmpName() {
	        return empName;
	    }

	    public void setEmpName(String empName) {
	        this.empName = empName;
	    }

	

}
