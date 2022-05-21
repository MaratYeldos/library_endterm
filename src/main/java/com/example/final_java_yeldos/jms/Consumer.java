package com.example.final_java_yeldos.jms;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@KafkaListener(topics="mytopic", groupId="mygroup")
	public void consumeFromTopic(String message) throws Exception {
		System.out.println("Consummed message "+message);
	}
}
