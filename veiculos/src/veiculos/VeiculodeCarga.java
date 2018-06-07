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
public  class VeiculodeCarga extends Veiculo{
    
    double pesoMax;

    VeiculodeCarga(){
    }
    
    VeiculodeCarga(int r){
       
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getPesoMax() {
        return pesoMax;
    }

    @Override
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
        System.out.println("Veiculo de carga: " + pesoMax);
    }
}
