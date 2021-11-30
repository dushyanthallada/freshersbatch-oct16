package com.EmployeeManagement.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {
	@Autowired
	private CrudRepository crudRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee E1 = new Employee(587879, "Chaithanya", "Support", "Analyst", 21000);
		Employee E2 = new Employee(589897, "AnilKumar", "CEO", "Trainer", 50000);
		Employee E3 = new Employee(597979, "Dushyanth", "Developer", "Analyst", 21900);
		crudRepository.save(E1);
		crudRepository.save(E2);
		crudRepository.save(E3);
		System.out.println("Employeedetails");
		List<Employee> Employees = crudRepository.findAll();
		for (Employee E : Employees) {
			System.out.println(E.toString());
		}

	}
}
