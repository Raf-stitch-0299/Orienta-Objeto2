package br.com.alura.screenmatch.modelos;

//extends --> Palavra reservada para aplicar herança á uma classe
public class Filme extends Titulo {

    private String Diretor;

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }
}
