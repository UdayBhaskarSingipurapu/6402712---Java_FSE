package com.SpringDataJpa_Ex2b;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringDataJpa_Ex2b.model.Employee;
import com.SpringDataJpa_Ex2b.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaEx2bApplication {
	
	private static EmployeeService empService;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaEx2bApplication.class, args);
		
		empService = context.getBean(EmployeeService.class);
		
		Employee e = new Employee();
		e.setId(101);
		e.setName("Uday");
		e.setSalary(10000);
		
		empService.saveEmployee(e);
		
		Optional<Employee> emp = empService.getEmployee(101);
		System.out.println(emp.toString());
	}

}
