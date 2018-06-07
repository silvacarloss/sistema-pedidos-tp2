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
public class Caminhao extends Veiculo{
    double pesoMax;
  
    Caminhao(){
    }
    
    Caminhao(double pesoMax){
        setPesoMax(pesoMax);
    };
    
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
    
     public void listarTudo()
    {
        System.out.println("Caminhao: " + pesoMax);
    }
    
}
