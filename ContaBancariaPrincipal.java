public class ContaBancariaPrincipal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.Titular= ("007");
        conta.setNumeroConta(123);
        conta.setSaldo(200000);

        System.out.println("Numero da Conta "  + conta.getNumeroConta());
        System.out.println("Seu saldo " + conta.getSaldo());
        System.out.println("Titular " + conta.Titular );

    }
}
