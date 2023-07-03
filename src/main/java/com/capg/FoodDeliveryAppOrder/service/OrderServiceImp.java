package com.capg.FoodDeliveryAppOrder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FoodDelivery.exceptions.ResourcesNotFoundException;
import com.capg.FoodDeliveryAppOrder.entity.Customer;
import com.capg.FoodDeliveryAppOrder.entity.Order;
import com.capg.FoodDeliveryAppOrder.repository.copy.OrderRepository;

@Service
public class OrderServiceImp  implements OrderService {
	
	@Autowired
	private OrderRepository orderRespository;
	
	@Override
	public Order placeOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRespository.save(order);
	}

	@Override
	public void cancelOrder(int orderId) {
		// TODO Auto-generated method stub
		orderRespository.deleteById(orderId);		
	}

	@Override
	public Order viewOrder(int orderId) throws Exception {
		// TODO Auto-generated method stub
		return orderRespository.findById(orderId)
				.orElseThrow(() -> new ResourcesNotFoundException("User Id is not found on server !! : " + orderId));
	}

	@Override
	public String paymentOrder(long customerId) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setPaymentStatus("Success");
		return "Payment Success";
	}

}
