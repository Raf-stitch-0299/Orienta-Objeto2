package br.com.alura.screenmatch.modelos;

public class AlunoPrincipal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Cipher", 6.6, 6.6, 6.6);
        Aluno aluno2 = new Aluno("Stenford", 10.0, 10.0, 10.0);
        Aluno aluno3 = new Aluno("Stanley", 2.8, 3.3, 4.5);
        Aluno aluno4 = new Aluno("Mabel", 6.8, 7.3, 8.5);
        Aluno aluno5 = new Aluno("Mason", 9.8, 9.3, 9.5);
        Aluno aluno6 = new Aluno("Wendy", 7.8, 7.3, 8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());

        System.out.println("Aluno 3:");
        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Nota 1: " + aluno3.getNota1());
        System.out.println("Nota 2: " + aluno3.getNota2());
        System.out.println("Nota 3: " + aluno3.getNota3());
        System.out.println("Média: " + aluno3.calcularMedia());

        System.out.println("Aluno 4:");
        System.out.println("Nome: " + aluno4.getNome());
        System.out.println("Nota 1: " + aluno4.getNota1());
        System.out.println("Nota 2: " + aluno4.getNota2());
        System.out.println("Nota 3: " + aluno4.getNota3());
        System.out.println("Média: " + aluno4.calcularMedia());

        System.out.println("Aluno 5:");
        System.out.println("Nome: " + aluno5.getNome());
        System.out.println("Nota 1: " + aluno5.getNota1());
        System.out.println("Nota 2: " + aluno5.getNota2());
        System.out.println("Nota 3: " + aluno5.getNota3());
        System.out.println("Média: " + aluno5.calcularMedia());

        System.out.println("Aluno 6:");
        System.out.println("Nome: " + aluno6.getNome());
        System.out.println("Nota 1: " + aluno6.getNota1());
        System.out.println("Nota 2: " + aluno6.getNota2());
        System.out.println("Nota 3: " + aluno6.getNota3());
        System.out.println("Média: " + aluno6.calcularMedia());
    }
}

