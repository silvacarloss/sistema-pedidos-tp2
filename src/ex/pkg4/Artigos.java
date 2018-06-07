package ex.pkg4;

public class Artigos extends Materiais
{
    private String Autor;
    private Materiais Revista;

    public Materiais getRevista() {
        return Revista;
    }

    public void setRevista(Revistas Revista) {
        this.Revista = Revista;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    void setRevista(Materiais lista) 
    {
        this.Revista = lista;
    }
    
    @Override
    public void exibir()
    {
        System.out.println("Código: " + getCodigo());
        System.out.println("Título: " + getTitulo());
        System.out.println("Assunto: " + getAssunto());
        System.out.println("Autor: " + getAutor());
        System.out.println("Revista: " + getRevista().getTitulo());
        
    }
    
    
}
