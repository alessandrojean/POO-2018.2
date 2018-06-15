package pctbanco;

public class Banco {

  private Conta[] contas = new Conta[10];
  private int ultimoIndice = 0;

  /**
   * Abre uma nova conta no banco, com um valor
   * de {@codee depositoInicial} em seu saldo.
   * 
   * @param depositoInicial valor inicial da conta
   * @return id da conta criada
   */
  public int abrirConta(double depositoInicial) {
    if (ultimoIndice >= contas.length) {
      System.out.println("Lista cheia!");
      return -1;
    }

    Conta novaConta = new Conta();
    novaConta.setId(this.ultimoIndice + 1);
    novaConta.setSaldo(depositoInicial);

    this.contas[this.ultimoIndice] = novaConta;

    return this.ultimoIndice++;
  }

  /**
   * Efetua uma transação com o valor de {@code valor},
   * na conta {@code id}, se existente.
   * Caso o saldo seja insuficiente, imprime um erro.
   * 
   * @param id id da conta
   * @param valor valor da transação
   */
  public void transacao(int id, double valor) {
    if (id - 1 >= contas.length) {
      System.out.println("Conta inexistente!");
      return;
    }

    Conta conta = this.contas[id - 1];
    double novoSaldo = conta.getSaldo() + valor;

    if (novoSaldo < 0) {
      System.out.println("Valor insuficiente para saque!");
      return;
    }

    conta.setSaldo(novoSaldo);
  }

  /**
   * Retorna o saldo da conta {@code id}, se existente.
   * 
   * @param id id da conta
   * @return saldo da conta se existente
   */
  public double saldo(int id) {
    if (id - 1 >= contas.length) {
      System.out.println("Conta inexistente!");
      return Double.MAX_VALUE;
    }

    return this.contas[id - 1].getSaldo();
  }
  
}