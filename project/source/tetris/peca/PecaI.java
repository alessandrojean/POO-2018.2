package tetris.peca;

import java.awt.Color;

import tetris.Bloco;

public class PecaI extends Peca {
  
  public PecaI() {
    super('I');
  }

  @Override
  protected void iniciarBlocos() {
    int[][] posicoes = new int[][]{{-2, 0}, {-1, 0}, {0, 0}, {1, 0}};

    for (int[] dupla : posicoes) {
      Bloco blocoAtual = new Bloco(dupla[0], dupla[1]);
      blocoAtual.setCor(new Color(255, 35, 55));
      blocoAtual.setCorEscura(new Color(189, 30, 44));
      blocoAtual.setCorClara(new Color(255, 147, 149));

      adicionarBloco(blocoAtual);
    }
  }

}