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
public abstract class Veiculo {
    private int rodas;
    private double PesoMax;
    private String nome;
    public abstract void listarTudo();

    Veiculo(){
    
    }
    
    private Veiculo(int rodas){
    
    }
    
    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
       public double getPesoMax() {
        return PesoMax;
    }

    public void setPesoMax(double PesoMax) {
        this.PesoMax = PesoMax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void acelerar(){
    
    }
    
    public void rodar(){
    
    }
}
