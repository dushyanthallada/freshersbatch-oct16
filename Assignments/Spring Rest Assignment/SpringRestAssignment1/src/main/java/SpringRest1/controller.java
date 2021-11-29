package SpringRest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class controller {
	@GetMapping(path="/Greet")
	public String display()
	{
		return ("<h1>Hello World</h1>");
	}

}
