package exercicio1;

public class Assalariado extends Empregado
{
    private double salario;
    
    Assalariado()
    {
        
    }
    
    Assalariado(double salario)
    {
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public double vencimento()
    {
        return salario;
    }
    
    @Override
    public void listarTudo()
    {
        System.out.println("Salário: " + salario);
    }
    
}
