package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.Customer;

public interface CustomerRepo extends MongoRepository<Customer,Integer>{

}