package Resourse;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Customer;
import Repository.CustomerRepo;


@RestController
public class CustController {
	@Autowired
	private CustomerRepo repository;
	@PostMapping("/addCustomer")
	public String saveCustomer(@RequestBody Customer customer ) {
	repository.save(customer);
	return "Customer added with id :" + customer.getId();
}
	@GetMapping("/findCustomerById/{id}")
	public Optional<Customer> getCustomer(@PathVariable int id)
	{
        return repository.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable int id) {
		repository.deleteById(id);
		return "Customer deleted with id: " +id;
	}
	@GetMapping("/findAll")
	public List<Customer> getCusts()
	{
		return repository.findAll();
	}

	@PutMapping("/updateCustomer")
 public void updateCustomer(@RequestBody Customer customer) {
	if (customer != null)
	    repository.save(customer);
}
}