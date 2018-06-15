package pctbanco;

public class Conta {

  private int id;
  private double saldo;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void imprimirSaldo() {
    System.out.printf("[id = %d; saldo = %.2f]\n", getId(), getSaldo());
  }

}