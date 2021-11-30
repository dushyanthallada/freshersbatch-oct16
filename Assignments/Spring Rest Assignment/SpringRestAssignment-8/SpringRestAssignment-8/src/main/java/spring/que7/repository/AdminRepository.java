package spring.que7.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import spring.que8.model.Admin;


public interface AdminRepository extends MongoRepository<Admin,Integer> {

}
