package com.Employee.boot.EmployeeManagement;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CrudRepository extends MongoRepository<Employee,Integer> {


}
