package espaco;

public class DiscoVoador {

  private String cor;
  private int posicaoAtual = 0;
  boolean estacionado = false;

  public void darPartida() {
    System.out.println("Motor ligado!");
  }

  public void irParaFrente(int metros) {
    this.posicaoAtual += metros;
  }

  private boolean validaCor(String cor) {
    return (cor == "Cinza") || (cor == "Verde");
  }

  public void setCor(String cor) {
    if (validaCor(cor)) {
      this.cor = cor;
    } else {
      System.out.println("Cor inválida!");
    }
  }

  public String getCor() {
    return this.cor;
  }

}