package org.geeksforgeeks.kafka.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	String topic = "hello-world";
	
	
	public void send(String message) {
		kafkaTemplate.send(topic,message);
	}

}
