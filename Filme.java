package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //get buscar valor no atributo

    public   int getTotalDeAvaliacoes(){
      return totalDeAvaliacoes;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    //Set incluir valor 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }




    public   void exibirFichaTecnica(){
        System.out.println( "Nome do br.com.alura.screenmatch.modelos.Filme: " +  nome);
        System.out.println( "Ano de lançamento: " + anoDeLancamento);
        System.out.println( "Duração em minutos: " + duracaoEmMinutos);

    }

  public   void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

  public   double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
