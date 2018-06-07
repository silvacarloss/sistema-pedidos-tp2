package ex.pkg4;

public class Revistas extends Materiais
{
    private String Colecao;
    private String Editora;
    
    //MostraDetalhes

    public String getColecao() {
        return Colecao;
    }

    public void setColecao(String Colecao) {
        this.Colecao = Colecao;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }
    
    @Override
    public void exibir()
    {
        System.out.println("Código: " + getCodigo());
        System.out.println("Título: " + getTitulo());
        System.out.println("Assunto: " + getAssunto());
        System.out.println("Coleção: " + getColecao());
        System.out.println("Editora: " + getEditora());
        
    }
}
