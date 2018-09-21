package tetris;

public class BlocoNaoExisteTabuleiroException extends RuntimeException {
  private int linha;
  private int coluna;

  public BlocoNaoExisteTabuleiroException(int linha, int coluna) {
    super("Não existe bloco na posição (" + coluna + ", " + linha + ").");
    this.linha = linha;
    this.coluna = coluna;
  }

  /**
   * Retorna a linha que ocorreu a exceção.
   * 
   * @return linha que ocorreu
   */
  public int getLinha() {
    return linha;
  }

  /**
   * Retorna a coluna que ocorreu a exceção.
   * 
   * @return coluna que ocorreu
   */
  public int getColuna() {
    return coluna;
  }
}