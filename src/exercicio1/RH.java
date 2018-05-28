package exercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RH 
{
    private List<Empregado> lista;

    public RH() {
        this.lista = new ArrayList<>();
    }
    
    public void contratarEmpregado(String tipoEmpregado) throws IOException
    {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Nome:");
        String nome = input.readLine();
        
        System.out.println("Sobrenome:");
        String sobrenome = input.readLine();
        
        System.out.println("CPF:");
        String cpf = input.readLine();
        
        switch(tipoEmpregado)
        {
            case "A":
                Assalariado assalariado = new Assalariado();
                
                assalariado.setNome(nome);
                assalariado.setSobrenome(sobrenome);
                assalariado.setCpf(cpf);
                
                System.out.println("Salário:");
                assalariado.setSalario(Double.parseDouble(input.readLine()));
                lista.add(assalariado);
                break;
            case "C":
                Comissionado comissionado = new Comissionado();
                
                comissionado.setNome(nome);
                comissionado.setSobrenome(sobrenome);
                comissionado.setCpf(cpf);
                
                System.out.println("Taxa de comissão:");
                comissionado.setTaxaComissao(Double.parseDouble(input.readLine()));
                lista.add(comissionado);
                break;
            case "H":
                Horista horista = new Horista();
                
                horista.setNome(nome);
                horista.setSobrenome(sobrenome);
                horista.setCpf(cpf);
                
                System.out.println("Preço por hora:");
                horista.setPrecoHora(Double.parseDouble(input.readLine()));
                lista.add(horista);
                break;
        }
    }
    
    public void calcularVencimento(Empregado empregado)
    {
        System.out.println(empregado.vencimento());
    }
    
    public Empregado buscarEmpregado(String cpf)
    {
        for(Empregado empregado:lista)
        {
            if (empregado.getCpf().equals(cpf)) 
            {
                return empregado;
            }
            else
            {
                lista.iterator().next();
            }
        }
        
        System.out.println("Empregado não encontrado!");
        return null;
    }
    
    public void menuRH() throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int opcao;
        
        do
        {
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - Contratar empregado");
            System.out.println("2 - Calcular vencimento");
            System.out.println("3 - Listar todos os empregados");
            System.out.println("0 - Sair do sistema");
            opcao = Integer.parseInt(input.readLine());
            
            switch(opcao)
            {
                case 1:
                    int opcaoEmpregado;
                    
                    System.out.println("Escolha uma opção abaixo:");
                    System.out.println("1 - Assalariado");
                    System.out.println("2 - Comissionado");
                    System.out.println("3 - Horista");
                    System.out.println("0 - Voltar ao menu anterior");
                    opcaoEmpregado = Integer.parseInt(input.readLine());
                    
                    switch(opcaoEmpregado)
                    {
                        case 1:
                            contratarEmpregado("A");
                            break;
                        case 2:
                            contratarEmpregado("C");
                            break;
                        case 3:
                            contratarEmpregado("H");
                            break;
                        case 0:
                            menuRH();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            menuRH();
                            break;
                    }
                    
                    break;
                case 2:
                    System.out.println("Digite o cpf do empregado:");
                    String cpf = input.readLine();
                    calcularVencimento(buscarEmpregado(cpf));
                    System.out.println("Digite 1 para voltar ao menu anterior ou 0 para sair do sistema");
                    if("1".equals(input.readLine()))
                    {
                        menuRH();
                    }
                    else
                    {
                        System.exit(0);
                    }
                    break;
                case 3:
                    listarEmpregados();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    menuRH();
                    break;
            }
        }
        while(opcao != 0);
        
        System.exit(0);
    }
    
    public void listarEmpregados()
    {
        for (Empregado empregado:lista) 
        {
            System.out.println("Nome: " + empregado.getNome() + " " + empregado.getSobrenome());
            System.out.println("CPF: " + empregado.getCpf());
            empregado.listarTudo();
        }
        
    }
    
   
}
