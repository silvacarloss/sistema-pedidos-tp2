package br.edu.ifsp.btv.Controllers;

import java.util.Date;
import java.util.List;

public class Order {
	private Date orderDate;
	private String status;
	private List<Item> items;	

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
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public double calculateTotalWeight(){
		double totalWeight = 0.0;
		for(Item item : items) {
			totalWeight += item.getWeight();
		}
		return totalWeight;
	}
	
	public double calculateTax(){
		return 0.0;
	}
	
	public double calculateTotal() {
		double totalWeight = 0.0;
		for(Item item : items) {
			totalWeight += item.getPrice();
		}
		return totalWeight + calculateTax();
	}
}
