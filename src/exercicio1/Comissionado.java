package exercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Comissionado extends Empregado
{
    private double totalVenda;
    private double taxaComissao;
    
    Comissionado()
    {
        
    }
    
    Comissionado(double totalVenda, double taxaComissao)
    {
        setTotalVenda(totalVenda);
        setTaxaComissao(taxaComissao);
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    @Override
    public double vencimento()
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Total de vendas:");
        try {
            setTotalVenda(Double.parseDouble(input.readLine()));
        } catch (IOException ex) {
            Logger.getLogger(Comissionado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalVenda*taxaComissao;
    }
    
    @Override
    public void listarTudo()
    {
        System.out.println("Taxa de comissão: " + taxaComissao);
    }
}
