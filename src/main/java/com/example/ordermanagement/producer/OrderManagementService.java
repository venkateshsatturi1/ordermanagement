package com.example.ordermanagement.producer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.ordermanagement.dto.DataF;
import com.example.ordermanagement.dto.ItemOrder;
import com.example.ordermanagement.dto.Order;

@Service
public class OrderManagementService {
	
	
	@Value("${rabbitmq.exchange.name}")
	private String exchange;
	
	@Value("${rabbitmq.routing.key}")
	private String routingKey;


	
	private static final Logger LOGGER=LoggerFactory.getLogger(OrderManagementService.class);

	
	private RabbitTemplate rabbitTemplate;
	
	public OrderManagementService(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate=rabbitTemplate;
	}
	
	public void placeOrder(ItemOrder data) {
		LOGGER.info(String.format("Message sent to queue successfully.... -> %s", data.toString()));
		rabbitTemplate.convertAndSend(exchange,routingKey,data);
		
	}

}
