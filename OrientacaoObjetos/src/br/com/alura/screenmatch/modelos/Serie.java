package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int Temporadas;
    private int EpisodiosPorTemporada;
    private int MinutosPorEpisodio;
    private boolean Ativa;

    public int getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(int temporadas) {
        Temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return EpisodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        EpisodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return MinutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        MinutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return Ativa;
    }

    public void setAtiva(boolean ativa) {
        Ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return Temporadas * EpisodiosPorTemporada * MinutosPorEpisodio;
    }
}
