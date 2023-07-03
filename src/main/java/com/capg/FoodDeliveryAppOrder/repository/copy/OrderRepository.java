package com.capg.FoodDeliveryAppOrder.repository.copy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.FoodDeliveryAppOrder.entity.Order;

public interface OrderRepository  extends JpaRepository<Order, Integer> {

}
