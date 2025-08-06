public class IdadePessoaPrincipal {
    public static void main(String[] args) {
        IdadePessoa Idade = new IdadePessoa();

        Idade.setNome("Calvin");
        Idade.setIdade (14);

        System.out.println("Seu nome e: " + Idade.getNome());
        System.out.println("Sua Idade: " + Idade.getIdade());
        Idade.VerificarIdade();




    }
}
