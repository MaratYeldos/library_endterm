package com.example.final_java_yeldos.controller;

import com.example.final_java_yeldos.jms.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafkaapp")
public class KafkaController {

	@Autowired
	Producer producer;

	@PostMapping(value="/post")
	public void sendMessage(@RequestParam("msg") String msg) throws Exception {
		producer.publishToTopic(msg);
	}
}
