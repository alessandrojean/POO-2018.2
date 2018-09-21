package tetris.peca;

import java.util.ArrayList;
import java.util.List;

import tetris.Bloco;
import tetris.BlocoNaoExisteException;

public class Peca {
  private char tipo;
  private List<Bloco> blocos;
  private int contagemRotacoes = 0;

  private int maiorX = 0;
  private int menorX = Integer.MAX_VALUE;
  private int maiorY = 0;
  private int menorY = Integer.MAX_VALUE;

  public Peca(char tipo) {
    this(tipo, 1);
  }

  public Peca(char tipo, int nRotacoes) {
    this.blocos = new ArrayList<>();
    this.tipo = tipo;
    this.contagemRotacoes = nRotacoes;
    iniciarBlocos();
  }

  public char getTipo() {
    return tipo;
  }

  public int getContagemRotacoes() {
    return contagemRotacoes;
  }

  public int quantidadeDeBlocos() {
    return blocos.size();
  }

  /**
   * Inicia os blocos da peça.
   * Utilizado nas peças elementares.
   */
  protected void iniciarBlocos() {
    // Método vazio.
  }

  /**
   * Adiciona um bloco na lista de blocos da peça.
   * 
   * @param bloco bloco que será adicionado
   */
  public void adicionarBloco(Bloco bloco) {
    menorX = Math.min(menorX, bloco.getX());
    maiorX = Math.max(maiorX, bloco.getX());
    menorY = Math.min(menorY, bloco.getY());
    maiorY = Math.max(maiorY, bloco.getY());
      
    blocos.add(bloco);
  }

  /**
   * Retorna o bloco na posição {@code i} da lista.
   * 
   * @param i posição do bloco
   * @return bloco na posição
   * @throws BlocoNaoExisteException se a posição for inválida
   */
  public Bloco blocoNaPosicao(int i) {
    if (i >= quantidadeDeBlocos())
      throw new BlocoNaoExisteException(i);

    return blocos.get(i);
  }

  /**
   * Retorna a rotação em sentido horário,
   * utilizando a estratégia do tipo, da peça atual.
   * 
   * @return peça rotacionada
   */
  public Peca rotacionadaDireita() {
    return FabricaRotacionarStrategy.criarEstrategia(tipo).rotacionarParaDireita(this);
  }

  /**
   * Retorna a rotação em sentido anti-horário,
   * utilizando a estratégia do tipo, da peça atual.
   * 
   * @return peça rotacionada
   */
  public Peca rotacionadaEsquerda() {
    return FabricaRotacionarStrategy.criarEstrategia(tipo).rotacionarParaEsquerda(this);
  }

  public int maiorY() {
    return maiorY;
  }

  public int maiorX() {
    return maiorX;
  }

  public int menorY() {
    return menorY;
  }

  public int menorX() {
    return menorX;
  }

  public int largura() {
    return maiorX - menorX;
  }

  public int altura() {
    return maiorY - menorY;
  }

  @Override
  public String toString() {
    String ret = "Peca[tipo=" + tipo + ", rot=" + contagemRotacoes + "]\n";
    for (Bloco b : blocos)  
      if (b != null)
        ret += "  " + b + "\n";
    return ret;
  }
  
}