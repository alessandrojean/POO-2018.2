package tetris.peca;

import tetris.Bloco;
import tetris.peca.Peca;

public class Rotacionador {
  /**
   * Rotaciona a peça atual no sentido horário,
   * utilizando a fórmula da rotação em cada bloco.
   * 
   * @param peca peça que será rotacionada
   * @return peça rotacionada
   */
  public static Peca rotacionarParaDireita(Peca peca) {
    Peca pecaNova = new Peca(peca.getTipo(), peca.getContagemRotacoes() * -1);

    // Para cada bloco, rotaciona suas posições.
    for (int i = 0; i < peca.quantidadeDeBlocos(); i++) {
      Bloco blocoAtual = peca.blocoNaPosicao(i);
      // Verifica se o bloco na posição i foi instanciado.
      if (blocoAtual != null) {
        int novoX = - blocoAtual.getY();
        int novoY = blocoAtual.getX();
        // Cria o novo bloco com as novas posições.
        Bloco blocoRotacionado = new Bloco(novoX, novoY, blocoAtual);        
        // Adiciona o bloco na nova peça.
        pecaNova.adicionarBloco(blocoRotacionado);
      }
    }

    return pecaNova;
  }

  /**
   * Rotaciona a peça atual no sentido anti-horário,
   * utilizando a fórmula da rotação em cada bloco.
   * 
   * @param peca peça que será rotacionada
   * @return peça rotacionada
   */
  public static Peca rotacionarParaEsquerda(Peca peca) {
    Peca pecaNova = new Peca(peca.getTipo(), peca.getContagemRotacoes() * -1);

    // Para cada bloco, rotaciona suas posições.
    for (int i = 0; i < peca.quantidadeDeBlocos(); i++) {
      Bloco blocoAtual = peca.blocoNaPosicao(i);
      // Verifica se o bloco na posição i foi instanciado.
      if (blocoAtual != null) {
        int novoX = blocoAtual.getY();
        int novoY = - blocoAtual.getX();
        // Cria o novo bloco com as novas posições.
        Bloco blocoRotacionado = new Bloco(novoX, novoY, blocoAtual);        
        // Adiciona o bloco na nova peça.
        pecaNova.adicionarBloco(blocoRotacionado);
      }
    }

    return pecaNova;
  }
  
}