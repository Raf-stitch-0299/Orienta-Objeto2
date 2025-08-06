public class ContaBancaria {
   private int NumeroConta;
    private double Saldo;
   public String Titular;
    

   public int getNumeroConta(){
       return NumeroConta;
   }

    public void setNumeroConta(int NumeroConta){
        this.NumeroConta = NumeroConta;
    }

    public double getSaldo(){
       return Saldo;
    }

    public void setSaldo(double Saldo){
        this.Saldo = Saldo;
    }


}
