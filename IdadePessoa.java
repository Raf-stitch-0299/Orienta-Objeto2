public class IdadePessoa {
    private String Nome;
    private int Idade;

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade){
        this.Idade = Idade;

    }

    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public void VerificarIdade(){
        if (Idade >= 18 ){
            System.out.println("Você vai aprender a pagar boleto");

        }else {
            System.out.println("Sua hora de pagar boleto Vai chegar....eu espero!!  \n AS: Boletinho seu amiguinho");
        }
    }



}
