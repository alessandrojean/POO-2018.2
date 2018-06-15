import pctbanco.Conta;

public class Principal {

  public static void main(String[] args) {
    Conta conta1 = new Conta();
    conta1.setId(1);
    conta1.setSaldo(5000);

    Conta conta2 = new Conta();
    conta2.setId(2);
    conta2.setSaldo(1000);

    conta1.imprimirSaldo();
    conta2.imprimirSaldo();
  }

}