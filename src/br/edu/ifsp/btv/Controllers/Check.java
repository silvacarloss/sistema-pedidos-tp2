package br.edu.ifsp.btv.Controllers;

public class Check extends Payment implements PaymentStrategy{

	private String name;
	private int bankID;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBankID() {
		return bankID;
	}

	public void setBankID(int bankID) {
		this.bankID = bankID;
	}

	public boolean authorized(boolean status) {
		return status;
	}
	
	@Override
	public void pay(double cash) {
		// TODO Auto-generated method stub
		System.out.println("R$" + cash + "Pagamento em Cheque");
	}

}
