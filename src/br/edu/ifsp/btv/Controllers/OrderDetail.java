package main.br.edu.ifsp.btv.Controllers;

public class OrderDetail {
	private int quantity;
	private double taxStatus;
	
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
}
