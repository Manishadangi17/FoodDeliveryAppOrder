package com.capg.FoodDeliveryAppOrder.service;

import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;

import com.capg.FoodDeliveryAppOrder.entity.Order;


public interface OrderService {
	public Order placeOrder(Order order);
	public void cancelOrder(int orderId);
	public Order viewOrder(int orderId) throws Exception;
	public String paymentOrder(long customerId);

}
