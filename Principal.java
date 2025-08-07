import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Sherek");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(89);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos() );

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Sherek 2" );
        meuFilme2.setAnoDeLancamento(2004);
        meuFilme2.setDuracaoEmMinutos(90);


        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        meuFilme2.exibirFichaTecnica();
        meuFilme2.avalia(8);
        meuFilme2.avalia(9);
        meuFilme2.avalia(6);
        System.out.println("Total de avaliações \n"+ meuFilme2.getTotalDeAvaliacoes() );
        System.out.println(meuFilme2.pegaMedia());


        Serie Lost = new Serie();
        Lost.setNome("Gravity Falls");
        Lost.setAnoDeLancamento(2012);
        Lost.setDuracaoEmMinutos(22);
        Lost.exibirFichaTecnica();
        Lost.setMinutosPorEpisodio(22);
        Lost.setTemporadas(2);
        Lost.setEpisodiosPorTemporada(40);
        System.out.println("Duração Para matatonar Gravity Falls: "  + Lost.getDuracaoEmMinutos());




    }
}