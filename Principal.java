import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Sherek");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(89);

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Sherek 2" );
        meuFilme2.setAnoDeLancamento(2004);
        meuFilme2.setDuracaoEmMinutos(90);


        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        System.out.println("Total de avaliações" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        meuFilme2.exibirFichaTecnica();
        meuFilme2.avalia(8);
        meuFilme2.avalia(9);
        meuFilme2.avalia(6);
        System.out.println("Total de avaliações" + meuFilme2.getTotalDeAvaliacoes());
        System.out.println(meuFilme2.pegaMedia());



    }
}