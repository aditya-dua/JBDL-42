package org.geeksforgeeks.ss.springSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}
	
	
	@GetMapping("/user")
	public String test() {
		return "Test API Works!";
	}
	
	
	@GetMapping("/home")
	public String home() {
		return "The Home  API Works!";
	}

}
