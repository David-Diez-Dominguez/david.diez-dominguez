package david.diez.dominguez.testController;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@CrossOrigin(origins = "https://daviddiezdominguez.azurewebsites.net/")
	@GetMapping("/")
	public String sayHello() {
		return "local-back-front-test";
	}
}