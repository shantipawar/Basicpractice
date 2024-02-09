package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.EmployeeCrudRepo;

@Service
public class EmployeeService implements EmployeeServiceInterface{
@Autowired
private EmployeeCrudRepo crudRepo;

@Override
public Employee addEmployee(Employee employee) {
	Employee savedEmployee =crudRepo.save(employee);
return	savedEmployee;
}

@Override
public Employee getEmpById(Long empidL) {
	return crudRepo.findById(empidL).get();
}

@Override
public void deleteEmpById(Long empidL) {
	crudRepo.deleteById(empidL);
	
}
}