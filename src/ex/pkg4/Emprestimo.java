package ex.pkg4;

import java.util.Date;

public class Emprestimo 
{    
    private Date dataEmprestimo = new Date();
    private Date dataRetorno = new Date();
    boolean Atraso;
    Usuarios Usuario;
    Materiais Material;
    
    //Novo

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) 
    {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) 
    {
        this.dataRetorno = dataRetorno;
    }    

    public boolean isAtraso() 
    {
        return Atraso;
    }

    public void setAtraso(boolean Atraso) {
        this.Atraso = Atraso;
    }
    
    public void exibirEmprestimo()
    {
        System.out.println("Usuário: " + Usuario.getNome());
        System.out.println("Material: " + Material.getTitulo());
        System.out.println("Data do empréstimo: " + getDataEmprestimo());
        System.out.println("Data do retorno: " + getDataRetorno());
        
    }
}
