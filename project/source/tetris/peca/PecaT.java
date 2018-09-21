package tetris.peca;

import java.awt.Color;

import tetris.Bloco;

public class PecaT extends Peca {
  
  public PecaT() {
    super('T');
  }

  @Override
  protected void iniciarBlocos() {
    int[][] posicoes = new int[][]{{-1, 0}, {0, 0}, {1, 0}, {0, 1}};

    for (int[] dupla : posicoes) {
      Bloco blocoAtual = new Bloco(dupla[0], dupla[1]);
      blocoAtual.setCor(new Color(0, 223, 255));
      blocoAtual.setCorClara(new Color(56, 255, 255));
      blocoAtual.setCorEscura(new Color(0, 200, 255));

      adicionarBloco(blocoAtual);
    }
  }

}