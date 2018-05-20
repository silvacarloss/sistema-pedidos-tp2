package main.br.edu.ifsp.btv.Controllers;

public abstract class Payment{
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}