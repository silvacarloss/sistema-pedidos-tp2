package exercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Horista extends Empregado
{
    private double precoHora;
    private double HorasTrabalhadas;

    Horista()
    {
        
    }
    
    Horista(double precoHora, double HorasTrabalhadas) 
    {
        setPrecoHora(precoHora);
        setHorasTrabalhadas(HorasTrabalhadas);
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhadas() {
        return HorasTrabalhadas;
    }

    public void setHorasTrabalhadas(double HorasTrabalhadas) {
        this.HorasTrabalhadas = HorasTrabalhadas;
    }
    
    @Override
    public double vencimento()
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Total de horas:");
        try 
        {
            setHorasTrabalhadas(Double.parseDouble(input.readLine()));
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Horista.class.getName()).log(Level.SEVERE, null, ex);
        }
        return precoHora*HorasTrabalhadas;
    }
    
    @Override
    public void listarTudo()
    {
        System.out.println("Preço da hora: " + precoHora);
    }
}
