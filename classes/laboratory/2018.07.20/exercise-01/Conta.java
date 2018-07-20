public class Conta {
  private double saldo;
  private double limite;
  private String titular;

  public Conta(String titular) {
    this.titular = titular;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void sacar(double valor) throws SaldoInsuficienteException {
    if (valor > saldo + limite)
      throw new SaldoInsuficienteException(saldo + limite);
    
    saldo -= valor;
  }

  @Override
  public String toString() {
    return titular + " tem " + saldo;
  }
}