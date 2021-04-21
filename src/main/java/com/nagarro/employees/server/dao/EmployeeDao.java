package com.nagarro.employees.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.employees.server.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
