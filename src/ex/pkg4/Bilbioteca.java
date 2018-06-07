package ex.pkg4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Bilbioteca 
{
    List<Usuarios> listaUsuarios;
    List<Materiais> listaMateriais;
    List<Emprestimo> listaEmprestimos;
    List<Reservas> listaReservas;
    
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public Bilbioteca() 
    {
        this.listaUsuarios = new ArrayList<>();
        this.listaMateriais = new ArrayList<>();
        this.listaEmprestimos = new ArrayList<>();
        this.listaReservas = new ArrayList<>();
    }
    
    public void criarUsuario() throws IOException
    {
        Usuarios usuario = new Usuarios();
        
        System.out.println("Nome:");
        usuario.setNome(input.readLine());
        
        System.out.println("Local:");
        usuario.setLocal(input.readLine());
        
        System.out.println("Telefone:");
        usuario.setTelefone(input.readLine());
        
        System.out.println("Senha:");
        usuario.setSenha(input.readLine());
        
        listaUsuarios.add(usuario);
    }
    
    public void cadastrarMaterial() throws IOException
    {
        int opcao;
        
        do
        {
            System.out.println("Escolha o tipo de material:");
            System.out.println("1 - Livro");
            System.out.println("2 - Revista");
            System.out.println("3 - Artigo");
            System.out.println("0 - Voltar ao menu anterior");
            
            opcao = Integer.parseInt(input.readLine());
            
            switch(opcao)
            {
                case 1:
                    Livros livro = new Livros();
                    
                    System.out.println("Código:");
                    livro.setCodigo(Integer.parseInt(input.readLine()));
                    
                    System.out.println("Assunto:");
                    livro.setAssunto(input.readLine());

                    System.out.println("Título:");
                    livro.setTitulo(input.readLine());
                    
                    System.out.println("Autor:");
                    livro.setAutor(input.readLine());
                    
                    System.out.println("ISBN:");
                    livro.setISBN(input.readLine());
                    
                    System.out.println("Editora:");
                    livro.setEditora(input.readLine());
                    
                    System.out.println("Edição:");
                    livro.setEdicao(input.readLine());
                    
                    listaMateriais.add(livro);
                    
                    break;
                case 2:
                    Revistas revista = new Revistas();
                    
                    System.out.println("Código:");
                    revista.setCodigo(Integer.parseInt(input.readLine()));
                    
                    System.out.println("Assunto:");
                    revista.setAssunto(input.readLine());

                    System.out.println("Título:");
                    revista.setTitulo(input.readLine());
                    
                    System.out.println("Coleção:");
                    revista.setColecao(input.readLine());
                    
                    System.out.println("Editora:");
                    revista.setEditora(input.readLine());
                    
                    listaMateriais.add(revista);
                    
                    break;
                case 3:
                    Artigos artigo = new Artigos();
                    
                    System.out.println("Código:");
                    artigo.setCodigo(Integer.parseInt(input.readLine()));
                    
                    System.out.println("Assunto:");
                    artigo.setAssunto(input.readLine());

                    System.out.println("Título:");
                    artigo.setTitulo(input.readLine());
                    
                    System.out.println("Autor:");
                    artigo.setAutor(input.readLine());
                    
                    int codigoRevista;
                    System.out.println("Código da revista:");
                    codigoRevista = Integer.parseInt(input.readLine());
                    
                    for (Materiais lista : listaMateriais) 
                    {
                        if(lista.getCodigo() == codigoRevista)
                        {
                            artigo.setRevista(lista);
                            break;
                        }
                    }

                    break;
                
            }
                    
        }
        while(opcao != 0);
        
        exibirMenu();
    }
    
    public void realizarEmprestimo() throws IOException
    {
        
        Calendar c = Calendar.getInstance();
        
        Emprestimo emprestimo = new Emprestimo();
        
        System.out.println("Nome do Usuario:");
        String nome = input.readLine();
        
        for (Usuarios usuario:listaUsuarios) 
        {
            if (nome == null ? usuario.getNome() == null : nome.equals(usuario.getNome())) 
            {
                emprestimo.Usuario = usuario;
                break;
            }
        }
        
        System.out.println("Título do material:");
        String titulo = input.readLine();
        
        for (Materiais material:listaMateriais) 
        {
            if (titulo == null ? material.getTitulo()== null : titulo.equals(material.getTitulo())) 
            {
                emprestimo.Material = material;
                break;
            }
        }
        
        emprestimo.setDataEmprestimo(c.getTime());
        
        c.add(Calendar.DAY_OF_MONTH, 7);
        emprestimo.setDataRetorno(c.getTime());
        
        System.out.println(emprestimo.Material.getTitulo());
        
       listaEmprestimos.add(emprestimo);
       
       
    }
    
    public void listarUsuarios()
    {
        for (Usuarios usuario:listaUsuarios) 
        {
            System.out.println(usuario.getNome());
            System.out.println(usuario.getTelefone());
            System.out.println(usuario.getSenha());
            System.out.println(usuario.getLocal());
        }
    }
    
    public void listarMateriais()
    {
        for(Materiais material:listaMateriais)
        {
            material.exibir();
        }
    }
    
    public void listarEmprestimos()
    {
        for (Emprestimo emprestimo:listaEmprestimos) 
        {
            emprestimo.exibirEmprestimo();
        }
    }
    
    public void fazerReserva() throws IOException
    {
        Calendar c = Calendar.getInstance();
        
        Reservas reserva = new Reservas();
        
        String titulo;
        
        System.out.println("Titulo do material:");
        titulo = input.readLine();
        
        for (Materiais material:listaMateriais) 
        {
            if (titulo.equals(material.getTitulo())) 
            {
                reserva.Material = material;
            }
        }
        
        reserva.setDataReserva(c.getTime());
        c.add(Calendar.DAY_OF_MONTH, 3);
        reserva.setDataValidade(c.getTime());
        
        listaReservas.add(reserva);
    
    }
    
    public void listarReservas()
    {
        for (Reservas reserva:listaReservas) 
        {
            reserva.exibirReservas();
        }
    }
    
    public void exibirMenu() throws IOException
    {
        int opcao;
        
        do
        {
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Cadastrar material");
            System.out.println("3 - Listar usuários");
            System.out.println("4 - Listar materiais");
            System.out.println("5 - Fazer empréstimo");
            System.out.println("6 - Listar empréstimos");
            System.out.println("7 - Fazer reserva");
            System.out.println("8 - Listar reservas");
            System.out.println("0 - Sair");
            
            opcao = Integer.parseInt(input.readLine());
            
            switch(opcao)
            {
                case 1:
                    criarUsuario();
                    break;
                case 2:
                    cadastrarMaterial();
                    break;
                case 3:
                    listarUsuarios();
                    break;
                case 4:
                    listarMateriais();
                    break;
                case 5:
                    realizarEmprestimo();
                    break;
                case 6:
                    listarEmprestimos();
                    break;
                case 7:
                    fazerReserva();
                    break;
                case 8:
                    listarReservas();
                    break;
            }
        }
        while(opcao != 0);
        
        System.exit(0);
    }
    
}
