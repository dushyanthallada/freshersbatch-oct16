package spring.que7.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import spring.que7.model.Order;



public interface OrderRepository extends MongoRepository<Order,Integer> {

}
