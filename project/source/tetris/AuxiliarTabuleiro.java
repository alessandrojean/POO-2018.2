package tetris;

import tetris.peca.Peca;

abstract class AuxiliarTabuleiro {
  /**
   * Verifica se a peça pode ser movida dentro do tabuleiro
   * para o novo destino ({@code novoX}, {@code novoY}).
   * 
   * @param blocos blocos do tabuleiro
   * @param peca peça atual
   * @param novoX novo x da peça
   * @param novoY novo y da peça
   * @return {@code true} se a peça pode ser movida
   */
  public static boolean podeMoverPeca(Bloco[][] blocos, Peca peca, int novoX, int novoY) {
    // Para cada bloco na peça atual, verifique.
    for (int i = 0; i < peca.quantidadeDeBlocos(); i++) {
      Bloco blocoAtual = peca.blocoNaPosicao(i);
      int x = novoX + blocoAtual.getX();
      int y = novoY + blocoAtual.getY();

      // Verifica se a posição está dentro do tabuleiro.
      if (!posicaoEhValida(blocos.length, blocos[0].length, y, x))
        return false;

      if (blocos[y][x] != null)
        return false;
    }

    return true;
  }

  /**
   * Verifica se a posição é válida e está dentro dos limites.
   * 
   * @param linhas quantidade de linhas da matriz
   * @param colunas quantidade de colunas da matriz
   * @param i indice das linhas
   * @param j indice das colunas
   * @return {@code true} se a posição é válida
   */
  public static boolean posicaoEhValida(int linhas, int colunas, int i, int j) {
    return i >= 0 && i < linhas && j >= 0 && j < colunas;
  }

  /**
   * Calcula o maior valor de y que a peça pode ir, a partir
   * do x e y atuais da peça.
   * 
   * @param blocos blocos do tabuleiro
   * @param peca peça que será movida
   * @param x x atual da peça
   * @param y y atual da peça
   * @return máximo valor em y
   */
  public static int getMaxY(Bloco[][] blocos, Peca peca, int x, int y) {
    while (y < blocos.length && podeMoverPeca(blocos, peca, x, y + 1)) {
      y++;
    }

    return y;
  }

  /**
   * Verifica se a linha está cheia.
   * 
   * @param blocos blocos do tabuleiro
   * @param linha linha que pode estar cheia
   * @return {@code true} se a linha está cheia
   */
  public static boolean linhaEstaCheia(Bloco[][] blocos, int linha) {
    for (int j = 0; j < blocos[linha].length; j++) {
      if (blocos[linha][j] == null)
        return false;
    }

    return true;
  }
  
  /**
   * Elimina a linha especificada.
   * 
   * @param blocos blocos do tabuleiro
   * @param linha linha que será eliminada
   */
  public static void eliminarLinha(Bloco[][] blocos, int linha) {
    // Elimina os blocos da linha.
    for (int j = 0; j < blocos[linha].length; j++)
      blocos[linha][j] = null;
  }

  /**
   * Insere a peça no tabuleiro nas posições passadas,
   * copiando bloco a bloco da peça para o tabuleiro.
   * 
   * @param blocos blocos do tabuleiro
   * @param peca peça que será inserida
   * @param xPeca x que será inserido
   * @param yPeca y que será inserido
   */
  public static void inserirNoTabuleiro(Bloco[][] blocos, Peca peca, int xPeca, int yPeca) {
    for (int i = 0; i < peca.quantidadeDeBlocos(); i++) {
      Bloco blocoAtual = peca.blocoNaPosicao(i);
      int x = xPeca + blocoAtual.getX();
      int y = yPeca + blocoAtual.getY();
      blocos[y][x] = blocoAtual; 
    }
  }
}