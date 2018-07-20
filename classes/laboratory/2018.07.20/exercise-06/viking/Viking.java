package viking;

public abstract class Viking {
  private String posicao;

  public Viking(String posicao) {
    this.posicao = posicao;
  }  

  @Override
  public String toString() {
    return posicao + " ARRGH";
  }
}