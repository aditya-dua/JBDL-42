package org.geeksforgeeks.jbdl42.redisexample.APIUsingRedis;

import java.util.List;

import org.geeksforgeeks.jbdl42.redisexample.APIUsingRedis.entity.Product;
import org.geeksforgeeks.jbdl42.redisexample.APIUsingRedis.repository.ProductDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/product")
public class ApiUsingRedisApplication {

	@Autowired
	private ProductDAORepository dao;
	
	@GetMapping
	public List<Object> fetchAllProducts(){
	
		return dao.getAll();
	}
	
	@PostMapping
	public Product save(@RequestBody Product product){
		
	
		return dao.save(product);
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiUsingRedisApplication.class, args);
	}
	
	

}
