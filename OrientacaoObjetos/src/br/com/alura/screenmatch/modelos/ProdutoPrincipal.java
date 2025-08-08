package br.com.alura.screenmatch.modelos;

public class ProdutoPrincipal {
    public static void main(String[] args) {
        Produto camiseta = new Produto();

        camiseta.setNomeProduto("Camiseta do Bill");
        camiseta.setPreco(50.00);

        System.out.println("Nome do Produto: " + camiseta.getNomeProduto() );
        System.out.println("Preço: " + camiseta.getPreco());

        camiseta.aplicarDesconto(66);
        System.out.println("Descontinho da camiseta: "  + camiseta.getPreco());


    }
}
