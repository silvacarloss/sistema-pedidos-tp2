package ex.pkg4;

public class Livros extends Materiais
{
    private String Editora;
    private String Edicao;
    private String ISBN;
    private String Autor;
    
    
    //MostraDetalhes

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public String getEdicao() {
        return Edicao;
    }

    public void setEdicao(String Edicao) {
        this.Edicao = Edicao;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    @Override
    public void exibir()
    {
        System.out.println("Código: " + getCodigo());
        System.out.println("Título: " + getTitulo());
        System.out.println("Assunto: " + getAssunto());
        System.out.println("Editora: " + getEditora());
        System.out.println("Edição: " + getEdicao());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Autor: " + getAutor());
    }
}
