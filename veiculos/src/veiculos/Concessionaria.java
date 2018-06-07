/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gusta
 */
public class Concessionaria {
    private final List<Veiculo> lista;

    public Concessionaria() {
        this.lista = new ArrayList<>();
    }
    
    public void cadastrarVeiculo(String concessionaria) throws IOException
    {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Nome: ");
        String nome = input.readLine();
        
        System.out.println("Carga Maxima: ");
        String peso = input.readLine();
        
        System.out.println("Rodas: ");
        String rodas = input.readLine();
        
        switch(concessionaria)
        {
            case "T":
                Trator trator = new Trator();
                
                trator.setNome(nome);
                trator.setPesoMax(Integer.parseInt(peso));
                trator.setRodas(Integer.parseInt(rodas));
                
                lista.add(trator);
                break;
            case "C":
                Caminhao caminhao = new Caminhao();
                 
                 caminhao.setNome(nome);
                 caminhao.setPesoMax(Integer.parseInt(peso));
                 caminhao.setRodas(Integer.parseInt(rodas));
                 
                lista.add(caminhao);
                break;
            case "CA":
                Carro carro = new Carro();
                
                carro.setNome(nome);
                carro.setPesoMax(Integer.parseInt(peso));
                carro.setRodas(Integer.parseInt(rodas));
               
                lista.add(carro);
                break;
             case "VC":
                VeiculodeCarga veiculocarga = new VeiculodeCarga();
                
                veiculocarga.setNome(nome);
                veiculocarga.setPesoMax(Integer.parseInt(peso));
                veiculocarga.setRodas(Integer.parseInt(rodas));
                
                lista.add(veiculocarga);
                break;
        }
    }
    
    public  Veiculo buscarVeiculo(String nome)
    {
        for(Veiculo veiculo:lista)
        {
            if (veiculo.getNome().equals(nome)) 
            {
                return veiculo;
            }
            else
            {
                lista.iterator().next();
                System.out.println("Veiculo não encontrado!");
            }
        }
        
        
        return null;
    }
    
    public void menuConcessionaria() throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int opcao;
        
        do
        {
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Buscar");
            System.out.println("3 - Listar todos ");
            System.out.println("0 - Sair do sistema");
            opcao = Integer.parseInt(input.readLine());
            
            switch(opcao)
            {
                case 1:
                    int opcaoConcessionaria;
                    
                    System.out.println("Escolha uma opção abaixo:");
                    System.out.println("1 - Caminhao");
                    System.out.println("2 - Carro");
                    System.out.println("3 - Trator");
                    System.out.println("4 - Veiculo de carga");
                    System.out.println("0 - Voltar ao menu anterior");
                    opcaoConcessionaria = Integer.parseInt(input.readLine());
                    
                    switch(opcaoConcessionaria)
                    {
                        case 1:
                            cadastrarVeiculo("CA");
                            break;
                        case 2:
                            cadastrarVeiculo("C");
                            break;
                        case 3:
                            cadastrarVeiculo("T");
                            break;
                        case 4:
                            cadastrarVeiculo("VC");
                            break;
                        case 0:
                            menuConcessionaria();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            menuConcessionaria();
                            break;
                    }
                    
                    break;
                case 2:
                    System.out.println("Digite o nome do veiculo:");
                    String veiculo = input.readLine();
                    buscarVeiculo(veiculo);
                    System.out.println("Digite 1 para voltar ao menu anterior ou 0 para sair do sistema");
                    if("1".equals(input.readLine()))
                    {
                        menuConcessionaria();
                    }
                    else
                    {
                        System.exit(0);
                    }
                    break;
                case 3:
                    listarVeiculos();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    menuConcessionaria();
                    break;
            }
        }
        while(opcao != 0);
        
        System.exit(0);
    }
    
    public void listarVeiculos()
    {
        for (Veiculo veiculo:lista) 
        {
            String nome = veiculo.getNome();
            double peso = veiculo.getPesoMax();
            int rodas = veiculo.getRodas();
            
            System.out.println("Nome: "+ nome );
            System.out.println("Peso max: " + peso);
            System.out.println("Peso max: " + rodas);
            
            veiculo.listarTudo();
        }
        
    }
}
