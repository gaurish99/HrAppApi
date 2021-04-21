package com.nagarro.employees.server.services;

import java.util.List;

import com.nagarro.employees.server.model.Employee;

public interface EmployeeService {

	public List<Employee> getData();

	public Employee getData(int employeeId);

	public Employee addData(Employee employee);

	public Employee updateData(Employee employee);

	public void deleteData(int employeeId);

}
