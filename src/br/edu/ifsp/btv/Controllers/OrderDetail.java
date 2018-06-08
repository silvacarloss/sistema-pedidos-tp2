package br.edu.ifsp.btv.Controllers;

import java.util.List;

public class OrderDetail {
	private int quantity;
	private double taxStatus;
	private List<Item> items;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTaxStatus() {
		return taxStatus;
	}
	public void setTaxStatus(double taxStatus) {
		this.taxStatus = taxStatus;
	}
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public double calculateTotalWeight(){
		double totalWeight = 0.0;
		for(Item item : getItems()) {
			totalWeight += item.getWeight();
		}
		return totalWeight;
	}
	
	public double calculateTotal() {
		double totalWeight = 0.0;
		for(Item item : getItems()) {
			System.out.println(item.getPrice());
			totalWeight += item.getPrice();
		}
		return totalWeight + calculateTax();
	}
	
	public double calculateTax(){
		return 0.0;
	}
}
