package tetris.peca;

import java.awt.Color;

import tetris.Bloco;

public class PecaO extends Peca {
  
  public PecaO() {
    super('O');
  }

  @Override
  protected void iniciarBlocos() {
    int[][] posicoes = new int[][]{{-1, 0}, {0, 0}, {-1, 1}, {0, 1}};

    for (int[] dupla : posicoes) {
      Bloco blocoAtual = new Bloco(dupla[0], dupla[1]);
      blocoAtual.setCor(new Color(255, 226, 86));
      blocoAtual.setCorClara(new Color(255, 255, 49));
      blocoAtual.setCorEscura(new Color(255, 188, 0));

      adicionarBloco(blocoAtual);
    }
  }

}