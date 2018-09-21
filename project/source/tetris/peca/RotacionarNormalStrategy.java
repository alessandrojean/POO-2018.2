package tetris.peca;

public class RotacionarNormalStrategy implements RotacionarStrategy {

  public Peca rotacionarParaDireita(Peca peca) {
    return Rotacionador.rotacionarParaDireita(peca);
  }

  public Peca rotacionarParaEsquerda(Peca peca) {
    return Rotacionador.rotacionarParaEsquerda(peca);
  }
  
}