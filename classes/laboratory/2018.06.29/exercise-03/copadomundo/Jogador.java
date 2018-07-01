package copadomundo;

public class Jogador {
  private int numeroCamisa;
  private String posicao;
  private String nome;

  public Jogador(int numeroCamisa, String posicao) {
    this(numeroCamisa, posicao, "?");
  }

  public Jogador(int numeroCamisa, String posicao, String nome) {
    this.numeroCamisa = numeroCamisa;
    this.posicao = posicao;
    this.nome = nome;
  }

  public int getNumeroCamisa() {
    return numeroCamisa;
  }

  public String getPosicao() {
    return posicao;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public String toString() {
    return nome + " (" + numeroCamisa + ") - " + posicao;
  }
}