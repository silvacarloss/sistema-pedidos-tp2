package br.edu.ifsp.btv.Controllers;

import java.util.Date;
import java.util.List;

public class Order {
	private Date orderDate;
	private String status;	

	private Customer customer;
	private Payment paymentMethod;	
	
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Payment getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(Payment paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
}
