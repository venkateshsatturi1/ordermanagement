package com.example.ordermanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ordermanagement.dto.DataF;
import com.example.ordermanagement.dto.ItemOrder;
import com.example.ordermanagement.dto.Order;
import com.example.ordermanagement.producer.OrderManagementService;


@RestController
@RequestMapping("/api/v1")
public class OrderController {
	
	private OrderManagementService jsonproducer;
	
	
	public OrderController( OrderManagementService jsonproducer) {
		this.jsonproducer=jsonproducer;
		
	}

	@PostMapping("/publish")
	public ResponseEntity<String> sendJsonMessage(@RequestBody ItemOrder data){
		jsonproducer.placeOrder(data);
		return ResponseEntity.ok("Data sent to Queue successfully...");
	}

}
