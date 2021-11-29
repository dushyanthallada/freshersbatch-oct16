package SpringRest3;

import java.util.ArrayList; 

import java.util.List;  
import org.springframework.stereotype.Component;

import model.Addressclass;  
@Component  
public class AddressService {
	

	 public static int usersCount=5;  
	//creating an instance of ArrayList  
	private static List<Addressclass> users=new ArrayList<>();  
	//static block   
	static  
	{  
	//adding users to the list  
	users.add(new Addressclass(123, "Queens","NY","USA"));
	users.add(new Addressclass(345, "newyork","NY","USA"));
	users.add(new Addressclass(567, "manhattan","Ny","USA"));
	users.add(new Addressclass(789, "vegas","LA","UK"));
	
	}  
	//method that retrieve all users from the list  
	public List<Addressclass> findAll()  
	{  
	return users;  
	}  
	//method that add the user in the list   
	public Addressclass save(Addressclass user)  
	{  
	if(user.getId()==null)  
	{  
	//increments the user id  
	user.setId(++usersCount);  
	}  
	users.add(user);  
	return user;  
	}  
	//method that find a particular user from the list  
	public Addressclass findOne(int id)  
	{  
	for(Addressclass user:users)  
	{  
	if(user.getId()==id)  
	return user;  
	}  
	return null;  
	}  
	} 
