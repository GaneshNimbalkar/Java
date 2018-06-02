package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.EmpServiceImpl;
import com.model.Employee;
public class ClientProgram {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		EmpServiceImpl emp=(EmpServiceImpl)context.getBean("empService");
		
		Employee e=new Employee();
		e.setId(1);
		e.setName("Ganesh");
		emp.isAdd(e);
		System.out.println("Success...............");
		
	}

}
