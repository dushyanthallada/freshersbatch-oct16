package controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticateController {
	
	
		
		@RequestMapping("/authenticate/{username}/{password}")
		public String getMessage(@PathVariable("username") String username, @PathVariable("password") String password) {
			String UserId = "xyz@mail.com";
			String Pass = "pass@123";
			
			if(username.equals(UserId) && password.equals(Pass)) {
				return "Valid User";
			} else {
				return "Invalid User";
			}
		}
	}