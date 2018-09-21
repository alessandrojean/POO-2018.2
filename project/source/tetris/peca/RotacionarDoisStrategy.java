package tetris.peca;

public class RotacionarDoisStrategy implements RotacionarStrategy {

  public Peca rotacionarParaDireita(Peca peca) {
    return peca.getContagemRotacoes() == 1
      ? Rotacionador.rotacionarParaDireita(peca)
      : Rotacionador.rotacionarParaEsquerda(peca);
  }

  public Peca rotacionarParaEsquerda(Peca peca) {
    return peca.getContagemRotacoes() == -1
      ? Rotacionador.rotacionarParaEsquerda(peca)
      : Rotacionador.rotacionarParaDireita(peca);
  }
  
}