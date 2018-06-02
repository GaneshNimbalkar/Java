package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository("empDao")
public class EmpDAOImpl implements EmpDAO{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean isAdd(Employee employee) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(employee);
		t.commit();
		session.close();
		return true;
	}

	@Override
	public List<Employee> getAllRecords() {
		// TODO Auto-generated method stub
		return null;
	}

}
