package org.geeksforgeeks.kafka.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TopicListener {

	private String topicName="hello-world";
	
	@KafkaListener(topics = "hello-world",groupId="group_id")
	public void consume(ConsumerRecord<String, String> payload) {
		
		System.out.println("Topic Name :"+payload.topic());
		System.out.println("Key:"+payload.key());
		System.out.println("Value:"+payload.value());


		// This is where database comes into picture...and here we push the data into DB.
		
	}
}
