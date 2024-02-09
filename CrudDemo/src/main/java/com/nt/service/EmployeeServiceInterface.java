package com.nt.service;

import com.nt.entity.Employee;

public interface EmployeeServiceInterface {

	public Employee addEmployee(Employee employee);

	public Employee getEmpById(Long empidL);

	public void deleteEmpById(Long empidL);

}
