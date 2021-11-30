package com.database.orderdatabase;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepo extends MongoRepository<Order, Integer> {

}
