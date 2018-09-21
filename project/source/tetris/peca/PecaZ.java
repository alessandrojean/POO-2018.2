package tetris.peca;

import java.awt.Color;

import tetris.Bloco;

public class PecaZ extends Peca {
  
  public PecaZ() {
    super('Z');
  }

  @Override
  protected void iniciarBlocos() {
    int[][] posicoes = new int[][]{{-1, 0}, {0, 0}, {0, 1}, {1, 1}};

    for (int[] dupla : posicoes) {
      Bloco blocoAtual = new Bloco(dupla[0], dupla[1]);
      blocoAtual.setCor(new Color(83, 213, 0));
      blocoAtual.setCorClara(new Color(156, 255, 0));
      blocoAtual.setCorEscura(new Color(57, 160, 73));

      adicionarBloco(blocoAtual);
    }
  }

}