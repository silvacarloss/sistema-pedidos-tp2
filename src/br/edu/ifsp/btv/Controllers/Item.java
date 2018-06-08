package br.edu.ifsp.btv.Controllers;

public class Item {
	private double shippingWeight;
	private String description;
	private double price;
	
	public double getShippingWeight() {
		return shippingWeight;
	}
	public void setShippingWeight(float shippingWeight) {
		this.shippingWeight = shippingWeight;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public float getPriceForQuantity(float price, float shippingWeight) {
		return price*shippingWeight;
	}
	public double getWeight() {
		return shippingWeight;
	}
}
