package com.capg.FoodDeliveryAppOrder.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_details")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	
	private int orderId;
	private double price;
	private int quantity;

}
