package ex.pkg4;

import java.util.Date;

public class Reservas 
{
    private Date DataReserva = new Date();
    private Date DataValidade = new Date();
    Materiais Material;
    
    
    //Criar
    //Cancelar

    public Date getDataReserva() {
        return DataReserva;
    }

    public void setDataReserva(Date DataReserva) {
        this.DataReserva = DataReserva;
    }

    public Date getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(Date DataValidade) {
        this.DataValidade = DataValidade;
    }
    
    public void exibirReservas()
    {
        System.out.println("Material: " + Material.getTitulo());
        System.out.println("Data da reserva: " + getDataReserva());
        System.out.println("Data de validade: " + getDataValidade());
    }
}
