package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmpDAO;
import com.model.Employee;

@Service("empService")
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpDAO empDao;
	@Override
	public boolean isAdd(Employee employee) {
	 //boolean b=empDao.isAdd(employee);
		//return b;
		return empDao.isAdd(employee);
	}

	@Override
	public List<Employee> getAllRecords() {
		// TODO Auto-generated method stub
		return null;
	}

}
