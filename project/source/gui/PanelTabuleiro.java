package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.geom.Path2D;

import javax.swing.JPanel;
import javax.swing.Timer;

import gui.Desenhista;
import tetris.*;
import tetris.peca.Peca;

public class PanelTabuleiro extends JPanel implements TeclaPressionadaListener {
  private Tabuleiro tabuleiro;

  private boolean desenharPrevisao = false;

  public PanelTabuleiro(Tabuleiro tabuleiro) {
    setTabuleiro(tabuleiro);

    setOpaque(true);
    setBackground(new Color(25, 25, 25));
  }

  /**
   * Retorna uma instância com um bloco vazio, apenas
   * para fins estéticos do visual.
   */
  private Bloco getBlocoVazio() {
    Bloco blocoVazio = new Bloco(0, 0);
    blocoVazio.setCor(new Color(46, 46, 46));
    blocoVazio.setCorClara(new Color(49, 49, 49));
    blocoVazio.setCorEscura(new Color(33, 33, 33));
    return blocoVazio;
  }

  /**
   * Define o tabuleiro e reajusta o tamanho.
   * 
   * @param tabuleiro tabuleiro do jogo
   */
  public void setTabuleiro(Tabuleiro tabuleiro) {
    this.tabuleiro = tabuleiro;

    if (tabuleiro != null) {
      int larguraMinima = Bloco.LARGURA_PADRAO * tabuleiro.getQuantidadeColunas();
      int alturaMinima = Bloco.ALTURA_PADRAO * tabuleiro.getQuantidadeLinhas();
      setPreferredSize(new Dimension(larguraMinima + 3, alturaMinima + 2));
      setMaximumSize(new Dimension(larguraMinima + 3, alturaMinima + 2));
      invalidate();
    }
  }

  public void setDesenharPrevisao(boolean desenharPrevisao) {
    this.desenharPrevisao = desenharPrevisao;
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);

    if (tabuleiro == null)
      return;

    // Desenha as peças no tabuleiro.
    for (int i = 0; i < tabuleiro.getQuantidadeLinhas(); i++) {
      for (int j = 0; j < tabuleiro.getQuantidadeColunas(); j++) {
        Bloco blocoAtual = tabuleiro.blocoNaPosicao(i, j);
        int x = j * Bloco.LARGURA_PADRAO;
        int y = i * Bloco.ALTURA_PADRAO;
        Desenhista.desenharBloco(g, (blocoAtual == null) 
          ? getBlocoVazio() : blocoAtual, x, y, 255);
      }
    }

    // Desenha a peça atual que está caindo.
    if (!tabuleiro.acabou()) {
      int x = tabuleiro.getXPecaAtual();
      int y = tabuleiro.getYPecaAtual();
      Desenhista.desenharPeca(g, tabuleiro.getPecaAtual(), 
        x * Bloco.LARGURA_PADRAO, y * Bloco.ALTURA_PADRAO, 255);

      // Desenha a previsão de queda da peça atual no modo fácil.
      if (desenharPrevisao) {
        y = tabuleiro.getMaxYPecaAtual();
        Desenhista.desenharPeca(g, tabuleiro.getPecaAtual(), 
          x * Bloco.LARGURA_PADRAO, y * Bloco.ALTURA_PADRAO, 80);
      }
    }
  }

  @Override
  public void onTeclaPressionada(int keyCode) {
    switch (keyCode) {
      case KeyEvent.VK_UP:
        tabuleiro.rotacionarDireitaPecaAtual();
        break;
      case KeyEvent.VK_Z:
        tabuleiro.rotacionarEsquerdaPecaAtual(); 
        break;
      case KeyEvent.VK_LEFT:
        tabuleiro.irEsquerdaPecaAtual();
        break;
      case KeyEvent.VK_RIGHT:
        tabuleiro.irDireitaPecaAtual();
        break;
      case KeyEvent.VK_DOWN:
        tabuleiro.descerUmPecaAtual();
        break;
      case KeyEvent.VK_SPACE:
        tabuleiro.descerPecaAtual();
        break;
      case KeyEvent.VK_R:
        tabuleiro.limparTabuleiro();
        break;
    }

    repaint();
  }
}