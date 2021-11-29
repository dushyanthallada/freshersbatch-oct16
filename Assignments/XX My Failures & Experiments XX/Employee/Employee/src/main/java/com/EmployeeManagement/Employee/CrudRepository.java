package com.EmployeeManagement.Employee;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CrudRepository extends MongoRepository<Employee,String> {

}
