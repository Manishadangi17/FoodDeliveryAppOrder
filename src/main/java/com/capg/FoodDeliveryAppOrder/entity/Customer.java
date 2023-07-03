package com.capg.FoodDeliveryAppOrder.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Customer {
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long customerId ;
	  private String customerAddress;
	  private String customerName;
	  private Long customerContact;
	  private String customerEmail;
	  private String customerPassword;
	  private String paymentStatus;
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(Long customerContact) {
		this.customerContact = customerContact;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Long customerId, String customerAddress, String customerName, Long customerContact,
			String customerEmail, String customerPassword, String paymentStatus) {
		super();
		this.customerId = customerId;
		this.customerAddress = customerAddress;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerAddress=" + customerAddress + ", customerName="
				+ customerName + ", customerContact=" + customerContact + ", customerEmail=" + customerEmail
				+ ", customerPassword=" + customerPassword + "]";
	}
	
	  
	  
	

}
