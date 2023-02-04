package org.geeksforgeeks.kafka.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

	
	@Autowired
	KafkaSender kafkaSender;
	
	@GetMapping(value="/hw")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);
		return "Message has been sent to kafka broker on topic : hello world";
	}
}
