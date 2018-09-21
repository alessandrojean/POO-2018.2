package tetris;

public class BlocoNaoExisteException extends RuntimeException {
  private int i;

  public BlocoNaoExisteException(int i) {
    super("Não existe bloco na posição " + i + ".");
    this.i = i;
  }

  /**
   * Retorna a posição que a exceção ocorreu.
   * 
   * @return posição que ocorreu
   */
  public int getPosicao() {
    return i;
  }
}