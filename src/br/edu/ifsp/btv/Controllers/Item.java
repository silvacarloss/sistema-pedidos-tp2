package br.edu.ifsp.btv.Controllers;

public class Item {
	private float shippingWeight;
	private String description;
	private float price;
	
	public float getShippingWeight() {
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
	public float getPrice() {
		return price;
	}
	public float getPriceForQuantity(float price, float shippingWeight) {
		return price*shippingWeight;
	}
	public float getWeight() {
		return shippingWeight;
	}
}
