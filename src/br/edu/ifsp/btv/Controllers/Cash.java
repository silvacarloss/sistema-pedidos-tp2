package br.edu.ifsp.btv.Controllers;

public class Cash extends Payment implements PaymentStrategy{
    private double cashTendered;

    public double getCashTendered() {
        return cashTendered;
    }

    public void setCashTendered(double cashTendered) {
        this.cashTendered = cashTendered;
    }

	@Override
	public void pay(double cash) {
		// TODO Auto-generated method stub
		System.out.println("R$" + cash + "Pagamento em Dinheiro");
	}
}
