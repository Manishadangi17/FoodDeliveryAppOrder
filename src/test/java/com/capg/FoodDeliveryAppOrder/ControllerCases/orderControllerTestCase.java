package com.capg.FoodDeliveryAppOrder.ControllerCases;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.capg.FoodDeliveryAppOrder.controller.OrderController;
import com.capg.FoodDeliveryAppOrder.entity.Customer;
import com.capg.FoodDeliveryAppOrder.entity.Order;
import com.capg.FoodDeliveryAppOrder.repository.copy.OrderRepository;
import com.capg.FoodDeliveryAppOrder.service.OrderService;

@SpringBootTest
//@WebMvcTest(OrderController.class)
public class orderControllerTestCase {
	@Autowired
	private OrderController orderController;
	 @MockBean
	 private OrderRepository orderRepository;
	 private Order order ;
	 private Order order1 ;
	 private Order order2 ;
	 private Customer customer;
	 
	 
	 @BeforeEach
	 public void OrderControllerTestCaseSetup() {
		 order = new Order (1, 468.3,1);
		 order1 = new Order (2, 268.3,7);
		 order2 = new Order (3, 368.3,8);
	 }
	 @Test
	 public void placeOrderTest() {
		 Mockito.when(orderRepository.save(order)).thenReturn(order);
		 assertThat(orderController.placeOrder(order)).isEqualTo(order);
		 
	 }
	 
	 @Test
	 public void cancelOrderTest() {
		 Mockito.doNothing().when(orderRepository).deleteById(order.getOrderId());
		 orderController.cancelOrder(order.getOrderId());
		 verify(orderRepository, times(1)).deleteById(order.getOrderId());
		
	 }
	@Test
	public void viewOrderTest() throws Exception {
		Mockito.when(orderRepository.findById(1)).thenReturn(Optional.of(order));
		assertThat(orderController.viewOrder(1)).isEqualTo(order);
	}
	@Test
	public void paymentOrderTest() {
		customer = new Customer(1L,"Dewas","Aj",98765443321L,"email","password","fail");
		assertThat(orderController.paymentOrder(customer.getCustomerId())).isEqualTo("Payment Success");
	}
	
	@Test
	public void setAndgetTest() {
		Order orderInstance = new Order();
		orderInstance.setOrderId(1);
		orderInstance.setPrice(233);
		orderInstance.setQuantity(2);
		
		int id = orderInstance.getOrderId();
		double price = orderInstance.getPrice();
		int quantity = orderInstance.getQuantity();
		assertThat(id).isEqualTo(1);
		assertThat(price).isEqualTo(233);
		assertThat(quantity).isEqualTo(2);
		
	}
	

	
	
	
}
