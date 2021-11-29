package com.database.orderdatabase;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	private OrderRepo orepo;
	
	@PostMapping("/order")
	public String addorder(@RequestBody Order ord) {
		orepo.save(ord);
		return "Order Placed with Id: "+ord.getOrderid();
	}
	@GetMapping("/allorders")
	public List<Order>getords(){
		return orepo.findAll();
	}
	@DeleteMapping("/orddelete/{id}")
	public String deletebook(@PathVariable int id) {
		orepo.deleteById(id);
		return "Order Deleted with id :"+id;	
	}
	@GetMapping("/findord/{id}")
	public Optional<Order>getord(@PathVariable int id){
		return orepo.findById(id);
	}
}

