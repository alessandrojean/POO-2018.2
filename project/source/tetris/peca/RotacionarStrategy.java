package tetris.peca;

public interface RotacionarStrategy {
  /**
   * Rotaciona a peça para a direita, no sentido horário.
   * 
   * @param peca peça que será rotacionada
   * @return peça rotacionada
   */
  Peca rotacionarParaDireita(Peca peca);

  /**
   * Rotaciona a peça para a esquerda, no sentido anti-horário.
   * 
   * @param peca peça que será rotacionada
   * @return peça rotacionada
   */
  Peca rotacionarParaEsquerda(Peca peca);
}