package assignment_6;
import java.util.*; 
class Contact {    
long  phoneNumber;    
String name,email,gender;    

public Contact(long phoneNumber, String name, String email, String gender) {    
    this.phoneNumber = phoneNumber;    
    this.name = name;    
    this.email = email;    
    this.gender = gender;      
}    
}    
public class PhoneContacts {

	public static void main(String[] args) {
		Map<Long,Contact> map=new TreeMap<Long,Contact>();    
	      
	    Contact c1=new Contact(7569473323L,"Anil","Anil@gmail.com","M");  
	    Contact c2=new Contact(9701141237L,"Varun","Varun@gmail.com","M"); 
	    Contact c3=new Contact(8978505669L,"Srikanth","Srikanth@gmail.com","M"); 
	       
	    map.put(1L,c1); 
	    map.put(2L,c2);    
	    map.put(3L,c3);  
	       
	    for(Map.Entry<Long, Contact> entry:map.entrySet()){    
	        long key=entry.getKey();  
	        Contact c=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(c.phoneNumber+" "+c.name+" "+c.email+" "+c.gender);   
	    }    

	}

}
 

