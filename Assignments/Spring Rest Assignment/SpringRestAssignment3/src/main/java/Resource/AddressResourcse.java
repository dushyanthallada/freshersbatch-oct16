package Resource;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import SpringRest3.AddressService;
import model.Addressclass;  
@RestController  
public class AddressResourcse {
	

	@Autowired  
	private AddressService service;  
	@GetMapping("/address")  
	public List<Addressclass> retriveAllUsers()  
	{  
	return service.findAll();  
	}  
	@GetMapping("/address/{id}")  
	public Addressclass retriveUser(@PathVariable int id)  
	{  
	return service.findOne(id);  
	}  

	} 