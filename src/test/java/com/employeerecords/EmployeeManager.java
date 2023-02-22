package com.employeerecords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class EmployeeManager {	
	public String fileName;
	public Properties employeeRecords;
	
	public void existingEmployeeRecords() throws IOException {
		fileName = "employee.properties";
	    employeeRecords = new Properties();
        FileInputStream filestream = new FileInputStream(fileName);
        employeeRecords.load(filestream);
        filestream.close();
	}
	
	public void insertEmployee(int emplyeeNumber,String employeeName) {
		employeeRecords.setProperty(String.valueOf(emplyeeNumber), employeeName);
	}
	
	public void updateEmployee(int existingEmpNo,String employeeName) {
		employeeRecords.setProperty(String.valueOf(existingEmpNo), employeeName);
	}
	
	public void deleteEmployee(int existingEmpNo) {
		employeeRecords.remove(String.valueOf(existingEmpNo));
	}
	
	public void save() throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
		employeeRecords.store(fileOutputStream, "Employee Records");
		fileOutputStream.close();
	}
	
	
	
	public static void main(String[] args) {
		EmployeeManager obj = new EmployeeManager();
		obj.insertEmployee(123, "Raju");
	}
}
