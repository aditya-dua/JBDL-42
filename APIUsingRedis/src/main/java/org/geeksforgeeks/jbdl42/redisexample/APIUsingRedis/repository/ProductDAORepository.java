package org.geeksforgeeks.jbdl42.redisexample.APIUsingRedis.repository;

import java.util.List;

import org.geeksforgeeks.jbdl42.redisexample.APIUsingRedis.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAORepository {
	
	public static final String HASH_KEY = "Product";
	@Autowired
	private RedisTemplate<String, Object> template;
	
	public Product save(Product product) {
		template.opsForHash().put(HASH_KEY, product.getId(), product);
		return product;
	}
	
	public List<Object> getAll() {
		
		return template.opsForHash().values(HASH_KEY);
	}

}
