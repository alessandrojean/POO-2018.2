package tetris;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

import tetris.peca.*;

public class Tabuleiro {
  private Peca pecaAtual;
  private Peca proximaPeca;

  private int linhasRemovidas;
  private int xPecaAtual;
  private int yPecaAtual;

  private Bloco[][] tabuleiro;
  private int quantidadeLinhas;
  private int quantidadeColunas;

  private boolean acabou = false;
  private int linhasEliminadas = 0;
  private int placar = 0;

  public Tabuleiro(int quantidadeLinhas, int quantidadeColunas) {
    tabuleiro = new Bloco[quantidadeLinhas][quantidadeColunas];

    this.quantidadeLinhas = quantidadeLinhas;
    this.quantidadeColunas = quantidadeColunas;

    gerarProximaPeca();
    novaPeca();
  }

  /**
   * Retorna o bloco na posição ({@code coluna}, {@code linha}).
   * Se as posições forem inválidas, lança uma exceção
   * unchecked do tipo {@code BlocoNaoExisteTabuleiroException}.
   * 
   * @param linha linha do bloco
   * @param coluna coluna do bloco
   * @return bloco na posição passada
   * @throws BlocoNaoExisteTabuleiroException se os índices são inválidos
   */
  public Bloco blocoNaPosicao(int linha, int coluna) {
    if (linha < 0 || linha >= quantidadeLinhas || coluna < 0 || coluna >= quantidadeColunas)
      throw new BlocoNaoExisteTabuleiroException(linha, coluna);
    return tabuleiro[linha][coluna];
  }

  public int getLinhasEliminadas() {
    return this.linhasEliminadas;
  }

  public int getQuantidadeColunas() {
    return quantidadeColunas;
  }

  public int getQuantidadeLinhas() {
    return quantidadeLinhas;
  }

  public int getNivel() {
    return getLinhasEliminadas() / 10;
  }

  public int getPlacar() {
    return this.placar;
  }

  public Peca getPecaAtual() {
    return this.pecaAtual;
  }

  public Peca getProximaPeca() {
    return this.proximaPeca;
  }

  public int getXPecaAtual() {
    return this.xPecaAtual;
  }

  public int getYPecaAtual() {
    return this.yPecaAtual;
  }

  public int getMaxYPecaAtual() {
    return AuxiliarTabuleiro.getMaxY(tabuleiro, pecaAtual, xPecaAtual, yPecaAtual);
  }

  public boolean acabou() {
    return acabou;
  }

  /**
   * Gera a próxima peça.
   */
  private void gerarProximaPeca() {
    proximaPeca = GeradorPecas.gerarPecaAleatoria();
  }

  /**
   * Pega a próxima peça e passa para a atual, fazendo
   * um shift. Após, uma nova peça é gerada e colocada em próximo.
   */
  private void novaPeca() {
    pecaAtual = proximaPeca;

    xPecaAtual = quantidadeColunas / 2;
    yPecaAtual = 0;

    gerarProximaPeca();

    if (!AuxiliarTabuleiro.podeMoverPeca(tabuleiro, pecaAtual, xPecaAtual, yPecaAtual))
      acabou = true;
  }

  /**
   * Limpa todo o tabuleiro, eliminando todos os blocos
   * e recomeçando os placares e variáveis de controle.
   */
  public void limparTabuleiro() {
    for (int i = 0; i < quantidadeLinhas; i++) {
      for (int j = 0; j < quantidadeColunas; j++) {
        tabuleiro[i][j] = null;
      }
    }
    
    novaPeca();
    acabou = false;
    linhasEliminadas = 0;
    placar = 0;
  }

  /**
   * Executado quando uma peça cai no tabuleiro,
   * seja via hard drop ou soft drop.
   */
  private void pecaCaiu() {
    AuxiliarTabuleiro.inserirNoTabuleiro(tabuleiro, pecaAtual, xPecaAtual, yPecaAtual);
    eliminarLinhas();
    novaPeca();
  }

  /**
   * Elimina as linhas com reações em cadeia,
   * utilizando o algoritmo de flood-fill para
   * agrupar os blocos existentes acima de cada
   * linha eliminada.
   */
  private void eliminarLinhas() {
    Stack<Integer> linhasRemovidas = new Stack<>();
    
    int linhasEliminadasAtual = 0;
    // Itera pelas linhas e remove as que estão cheias.
    for (int i = 0; i < quantidadeLinhas; i++) {
      if (AuxiliarTabuleiro.linhaEstaCheia(tabuleiro, i)) {
      	linhasRemovidas.push(i);
      	AuxiliarTabuleiro.eliminarLinha(tabuleiro, i);
      	linhasEliminadasAtual++;
      }
    }

    while(!linhasRemovidas.isEmpty()) {
    	int linhaAtual = linhasRemovidas.pop();
      // Para cada linha eliminada cuja linha acima dela 
      // não tenha sido eliminada (ou seja onde devem ter peças restantes).
    	if(!linhasRemovidas.contains(linhaAtual - 1)) {
    		// Agrupa as novas pe袳 e as p�� mais para baixo que conseguir
    		Map<Integer, Peca> grupos = FloodFill.agruparBlocos(tabuleiro, linhaAtual - 1);
    		for (Map.Entry<Integer, Peca> p : grupos.entrySet()) {
    			int maxY = AuxiliarTabuleiro.getMaxY(tabuleiro, p.getValue(), p.getKey(), linhaAtual);
          AuxiliarTabuleiro.inserirNoTabuleiro(tabuleiro, p.getValue(), p.getKey(), maxY);
        }
    	}
    }

    if(linhasEliminadasAtual != 0) {
	    linhasEliminadas += linhasEliminadasAtual;
	    placar += Placar.calcularPontos(getNivel(), linhasEliminadasAtual);
	    eliminarLinhas();
    }
  }

  /**
   * Desce em uma unidade o y da peça atual.
   * 
   * @throws JogoAcabouException se o jogo já acabou
   */
  public void descerUmPecaAtual() {
    if (acabou)
      throw new JogoAcabouException();

    if (AuxiliarTabuleiro.podeMoverPeca(tabuleiro, pecaAtual, xPecaAtual, yPecaAtual + 1))
      yPecaAtual++;
    else
      pecaCaiu();
  }

  /**
   * Desce totalmente (hard drop) a peça atual
   * no y atual que ela está.
   * 
   * @throws JogoAcabouException se o jogo já acabou
   */
  public void descerPecaAtual() {
    if (acabou)
      throw new JogoAcabouException();

    yPecaAtual = getMaxYPecaAtual();
    pecaCaiu();
  }

  /**
   * Move a peça atual para a direita, se possível.
   * 
   * @throws JogoAcabouException se o jogo já acabou
   */
  public void irDireitaPecaAtual() {
    if (acabou)
      throw new JogoAcabouException();

    if (AuxiliarTabuleiro.podeMoverPeca(tabuleiro, pecaAtual, xPecaAtual + 1, yPecaAtual))
      xPecaAtual++;
  }

  /**
   * Move a peça atual para a esquerda, se possível.
   * 
   * @throws JogoAcabouException se o jogo já acabou
   */
  public void irEsquerdaPecaAtual() {
    if (acabou)
      throw new JogoAcabouException();

    if (AuxiliarTabuleiro.podeMoverPeca(tabuleiro, pecaAtual, xPecaAtual - 1, yPecaAtual))
      xPecaAtual--;
  }

  /**
   * Rotaciona em sentido horário a peça atual, se possível.
   * 
   * @throws JogoAcabouException se o jogo já acabou
   */
  public void rotacionarDireitaPecaAtual() {
    if (acabou)
      throw new JogoAcabouException();

    Peca pecaRotacionada = pecaAtual.rotacionadaDireita();
    if (AuxiliarTabuleiro.podeMoverPeca(tabuleiro, pecaRotacionada, xPecaAtual, yPecaAtual))
      this.pecaAtual = pecaRotacionada;
  }

  /**
   * Rotaciona em sentido anti-horário a peça atual, se possível.
   * 
   * @throws JogoAcabouException se o jogo já acabou
   */
  public void rotacionarEsquerdaPecaAtual() {
    if (acabou)
      throw new JogoAcabouException();

    Peca pecaRotacionada = pecaAtual.rotacionadaEsquerda();
    if (AuxiliarTabuleiro.podeMoverPeca(tabuleiro, pecaRotacionada, xPecaAtual, yPecaAtual))
      this.pecaAtual = pecaRotacionada;
  }
}