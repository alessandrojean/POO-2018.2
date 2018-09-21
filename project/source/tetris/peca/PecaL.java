package tetris.peca;

import java.awt.Color;

import tetris.Bloco;

public class PecaL extends Peca {
  
  public PecaL() {
    super('L');
  }

  @Override
  protected void iniciarBlocos() {
    int[][] posicoes = new int[][]{{-1, 0}, {0, 0}, {1, 0}, {-1, 1}};

    for (int[] dupla : posicoes) {
      Bloco blocoAtual = new Bloco(dupla[0], dupla[1]);
      blocoAtual.setCor(new Color(247, 147, 30));
      blocoAtual.setCorClara(new Color(250, 175, 64));
      blocoAtual.setCorEscura(new Color(240, 90, 41));

      adicionarBloco(blocoAtual);
    }
  }

}