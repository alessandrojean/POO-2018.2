package tetris.peca;

import java.awt.Color;

import tetris.Bloco;

public class PecaJ extends Peca {
  
  public PecaJ() {
    super('J');
  }

  @Override
  protected void iniciarBlocos() {
    int[][] posicoes = new int[][]{{-1, 0}, {0, 0}, {1, 0}, {1, 1}};

    for (int[] dupla : posicoes) {
      Bloco blocoAtual = new Bloco(dupla[0], dupla[1]);
      blocoAtual.setCor(new Color(28, 117, 187));
      blocoAtual.setCorClara(new Color(66, 168, 187));
      blocoAtual.setCorEscura(new Color(28, 66, 187));

      adicionarBloco(blocoAtual);
    }
  }

}