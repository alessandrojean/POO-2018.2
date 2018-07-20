public class SaldoInsuficienteException extends Exception {
  private double saldo;

  public SaldoInsuficienteException(double saldo) {
    super("O saldo da conta eh insuficiente!");
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }  
}