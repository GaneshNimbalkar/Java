package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmpDAO {
 
	 public boolean isAdd(Employee employee);
	 public List<Employee> getAllRecords();
}
