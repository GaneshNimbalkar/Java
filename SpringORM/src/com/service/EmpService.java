package com.service;

import java.util.List;

import com.model.Employee;

public interface EmpService {
	 public boolean isAdd(Employee employee);
	 public List<Employee> getAllRecords();
}
