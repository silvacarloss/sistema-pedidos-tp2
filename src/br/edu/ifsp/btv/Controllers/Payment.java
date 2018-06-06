package br.edu.ifsp.btv.Controllers;

public abstract class Payment{
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean pay() {
    	return true;
    }
}