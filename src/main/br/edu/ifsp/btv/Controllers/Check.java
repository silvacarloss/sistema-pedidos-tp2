package main.br.edu.ifsp.btv.Controllers;

public class Check 
{
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
    
    public boolean authorized(String informedName, int informedBankID)
    {
        return bankID == informedBankID && informedName.equals(name);
    }
}
