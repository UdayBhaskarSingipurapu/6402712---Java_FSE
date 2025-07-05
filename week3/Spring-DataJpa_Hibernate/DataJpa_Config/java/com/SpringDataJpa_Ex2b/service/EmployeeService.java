package com.SpringDataJpa_Ex2b.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringDataJpa_Ex2b.model.Employee;
import com.SpringDataJpa_Ex2b.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	public void saveEmployee(Employee emp) {
		empRepo.save(emp);
	}
	
	public Optional<Employee> getEmployee(Integer id) {
		return empRepo.findById(id);
	}
}
