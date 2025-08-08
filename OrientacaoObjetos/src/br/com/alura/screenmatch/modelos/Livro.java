package br.com.alura.screenmatch.modelos;

public class Livro {
    private String Titulo;
    private String Autor;


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("Nome do Autor: " + Autor );
        System.out.println("Titulo do livro: " + Titulo );

    }
}
