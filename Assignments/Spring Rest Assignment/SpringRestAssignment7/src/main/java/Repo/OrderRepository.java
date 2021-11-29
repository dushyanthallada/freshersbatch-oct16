package Repo;



import org.springframework.data.mongodb.repository.MongoRepository;

import order.Order;



public interface OrderRepository extends MongoRepository<Order,Integer> {

}
