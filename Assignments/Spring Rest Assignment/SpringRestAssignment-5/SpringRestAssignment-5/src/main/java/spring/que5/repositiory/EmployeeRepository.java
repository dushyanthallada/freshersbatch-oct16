package spring.que5.repositiory;

import org.springframework.data.mongodb.repository.MongoRepository;

import spring.que5.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

	
}
