package com.database.jdbcAndJpaDemo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipcodesController {
	@GetMapping("/anil")
	public List<Zipcodes> getAllBooks1() {
		Zipcodes zipcode1 = new Zipcodes(505453, "Telangana", "Jagitial", "India");
		List<Zipcodes> list1 = new ArrayList<Zipcodes>();
		list1.add(zipcode1);
		return list1;
	}

//		return Arrays.asList(new Zipcodes(505453l, "Telangana", "Jagitial" ,"India"));
	@GetMapping("/chaithu")
	public List<Zipcodes> getAllBooks2() {
		Zipcodes zipcode2 = new Zipcodes(534102, "Andhra Pradesh", "Tadepalligudem", "India");
		List<Zipcodes> list2 = new ArrayList<Zipcodes>();
		list2.add(zipcode2);
		return list2;
	}

	@GetMapping("/dussi")
	public List<Zipcodes> getAllBooks3() {
		Zipcodes zipcode3 = new Zipcodes(505453, "Andhra Pradesh", "Srikakulam", "India");
		List<Zipcodes> list3 = new ArrayList<Zipcodes>();
		list3.add(zipcode3);
		return list3;
	}
	@PutMapping("/{zipcode}")
	public boolean postzipcode(@PathVariable long zipcode ,@RequestBody Zipcodes zipcodes) {
		return true;
	}
	
}