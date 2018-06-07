/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

/**
 *
 * @author gusta
 */
public class Trator extends Veiculo {
    
    double pesoMax;

    Trator(){
    }
    
    Trator(double pesoMax){
        setPesoMax(pesoMax);
    }
    
    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }
    public void carregar(){
    
    }
    
    @Override
    public void acelerar(){
    
    }
    
    @Override
    public void rodar(){
    
    }
    
     public void listarTudo()
    {
        System.out.println("Trator: " + pesoMax);
    }
}
