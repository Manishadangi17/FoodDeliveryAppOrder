package com.capg.FoodDeliveryAppOrder.controller;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.FoodDeliveryAppOrder.entity.Order;
import com.capg.FoodDeliveryAppOrder.service.OrderService;

@RestController
@RequestMapping("/v3/api-docs/Order")

public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	org.slf4j.Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@PostMapping("/placeOrder")
	public Order placeOrder(@RequestBody Order order) {
		logger.info("[placeOrder] info message");
		logger.warn("[placeOrder] info message");
		logger.error("[placeOrder] info message");
		logger.debug("[placeOrder] info message");
		logger.trace("[placeOrder] info message");	
		return orderService.placeOrder(order);
		
	}
	
	@DeleteMapping("/cancelOrder/{orderId}")
	public void cancelOrder(@PathVariable int orderId) {
		logger.info("[cancelOrder] info message");
		logger.warn("[cancelOrder] info message");
		logger.error("[cancelOrder] info message");
		orderService.cancelOrder(orderId);
		
	}
	@GetMapping("/viewOrder/{orderId}")	
	public Order viewOrder(@PathVariable int orderId) throws Exception{
		logger.info("[viewOrder] info message");
		logger.warn("[viewOrder] info message");
		logger.error("[viewOrder] info message");
		logger.debug("[viewOrder] info message");
		logger.trace("[viewOrder] info message");
		return orderService.viewOrder(orderId);
	}
	
	@PutMapping("/paymentOrder/{customerId}")
	public String paymentOrder(@PathVariable long customerId) {
		return orderService.paymentOrder(customerId);
		
	}
}
