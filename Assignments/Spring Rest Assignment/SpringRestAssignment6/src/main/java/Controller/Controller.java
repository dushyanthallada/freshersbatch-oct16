package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import calci.calculator;




@RestController
public class Controller {
	
	calculator calculator = new calculator();
		@GetMapping("/add{a},{b}")
		public long  addition(@PathVariable long a,@PathVariable long b) {
			    return   a + b;
		}
		
		@GetMapping("/sub{a},{b}")
		public long  subtraction(@PathVariable long a,@PathVariable long b) {
			    return   a - b;
		}

		@GetMapping("/multi{a},{b}")
		public long  multiplication(@PathVariable long a,@PathVariable long b) {
			    return   a * b;
		}
		@GetMapping("/dive{a},{b}")
		public long  division(@PathVariable long a,@PathVariable long b) {
			    return   a / b;
		}
		
	}