package tetris;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tetris.peca.Peca;

public class FloodFill {
  /**
   * Agrupa os possíveis blocos existentes acima de {@code linha}.
   * 
   * @param tabuleiro tabuleiro do jogo
   * @param linha linha base
   * @return conjunto de peças indexadas pela posição x do bloco pivô
   */
  public static Map<Integer, Peca> agruparBlocos(Bloco[][] tabuleiro, int linha) {
    Map<Integer, Peca> grupos = new HashMap<>();

    // Percorre cada bloco na linha.
    for (int j = 0; j < tabuleiro[linha].length; j++) {
      if (tabuleiro[linha][j] == null)
        continue;

      Peca peca = new Peca('C');
      floodFill(tabuleiro, linha, j, j, linha, peca);
      grupos.put(j, peca);

      j += peca.maiorX();
    }

    return grupos;
  }

  /**
   * Efetua o algoritmo flood-fill no tabuleiro, para agrupar
   * os blocos e formar novas peças para a reação em cadeia.
   * 
   * Algoritmo adaptado de: https://en.wikipedia.org/wiki/Flood_fill
   * 
   * @param tabuleiro tabuleiro do jogo
   * @param i indice atual da linha na recursão
   * @param j indice atual da coluna na recursão
   * @param x x do bloco pivô
   * @param y y do bloco pivô
   * @param peca peça que será preenchida com os blocos
   */
  public static void floodFill(Bloco[][] tabuleiro, int i, int j, int x, int y, Peca peca) {
    if (i < 0 || i >= tabuleiro.length)
      return;
    if (j < 0 || j >= tabuleiro[0].length)
      return;
    if (tabuleiro[i][j] == null)
      return;

    Bloco blocoAtual = tabuleiro[i][j];
    
    int novoX = j - x;
    int novoY = i - y;

    Bloco blocoNovo = new Bloco(novoX, novoY, blocoAtual);
    
    peca.adicionarBloco(blocoNovo);
    tabuleiro[i][j] = null;

    floodFill(tabuleiro, i + 1, j, x, y, peca);
    floodFill(tabuleiro, i - 1, j, x, y, peca);
    floodFill(tabuleiro, i, j - 1, x, y, peca);
    floodFill(tabuleiro, i, j + 1, x, y, peca);    
  }

}