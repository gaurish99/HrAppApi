package com.nagarro.employees.server.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.employees.server.dao.EmployeeDao;
import com.nagarro.employees.server.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	List<Employee> list;

	@Override
	public List<Employee> getData() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getData(int employeeId) {

//		return employeeDao.getOne(employeeId);
		return employeeDao.findById(employeeId).get();
	}

	@Override
	public Employee addData(Employee employee) {

		employeeDao.save(employee);
		return employee;

	}

	@Override
	public Employee updateData(Employee employee) {

		employeeDao.save(employee);
		return employee;

	}

	@Override
	public void deleteData(int employeeId) {
		Employee entity = employeeDao.getOne(employeeId);

		employeeDao.delete(entity);

	}

}
