package david.diez.dominguez.testController;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/")
	public String sayHello() {
		return "back-front-test";
	}
}