package tetris.peca;

import java.awt.Color;

import tetris.Bloco;

public class PecaS extends Peca {
  
  public PecaS() {
    super('S');
  }

  @Override
  protected void iniciarBlocos() {
    int[][] posicoes = new int[][]{{0, 0}, {1, 0}, {-1, 1}, {0, 1}};

    for (int[] dupla : posicoes) {
      Bloco blocoAtual = new Bloco(dupla[0], dupla[1]);
      blocoAtual.setCor(new Color(200, 115, 255));
      blocoAtual.setCorClara(new Color(235, 184, 255));
      blocoAtual.setCorEscura(new Color(126, 62, 151));

      adicionarBloco(blocoAtual);
    }
  }

}