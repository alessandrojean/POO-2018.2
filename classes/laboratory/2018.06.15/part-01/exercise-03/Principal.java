import pctbanco.Banco;

public class Principal {

  public static void main(String[] args) {
    Banco banco = new Banco();

    // Criação de contas.
    banco.abrirConta(5000);
    banco.abrirConta(1000);

    // Saldo atual.
    System.out.printf("Conta 1: R$ %.2f\n", banco.saldo(1));
    System.out.printf("Conta 2: R$ %.2f\n", banco.saldo(2));

    // Transações.
    banco.transacao(1, 4000);
    banco.transacao(2, -3000);

    // Saldo após as transações.
    System.out.printf("Conta 1: R$ %.2f\n", banco.saldo(1));
    System.out.printf("Conta 2: R$ %.2f\n", banco.saldo(2));
  }

}