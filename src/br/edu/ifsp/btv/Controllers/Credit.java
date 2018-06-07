package br.edu.ifsp.btv.Controllers;

import java.util.Date;

public class Credit extends Payment implements PaymentStrategy {

	private String number;
	private boolean type;
	Date expDate;
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
		
	public boolean authorized(boolean status) {
		return status;
	}
	
	@Override
	public void pay(double cash) {
		// TODO Auto-generated method stub
		System.out.println("R$" + cash + "Pagamento em Cartão");
	}

}
