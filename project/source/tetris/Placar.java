package tetris;

public class Placar {

  private static final int[] PONTOS = {40, 100, 300, 1200};

  /**
   * Calcula a quantidade de pontos ganhos após ter
   * eliminado as linhas no jogo. Segue a fórmula
   * original do Tetris de NES.
   * 
   * @param nivel nivel atual do jogo
   * @param linhasEliminadas quantidade de linhas eliminadas
   * @return placar atual que deve ser incrementado ao existente
   */
  public static int calcularPontos(int nivel, int linhasEliminadas) {
    if (linhasEliminadas == 0)
      return 0;

    int multiplicador = (linhasEliminadas > PONTOS.length)
      ? PONTOS[PONTOS.length - 1] : PONTOS[linhasEliminadas - 1];

    return multiplicador * (nivel + 1);
  }  
}