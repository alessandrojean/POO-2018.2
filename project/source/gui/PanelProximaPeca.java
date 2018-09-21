package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import gui.Desenhista;
import tetris.Bloco;
import tetris.peca.Peca;
import tetris.peca.PecaI;

public class PanelProximaPeca extends JPanel {
  private Peca pecaDesenhada;

  public PanelProximaPeca() {
    int larguraMinima = Bloco.LARGURA_PADRAO * 4;
    int alturaMinima = Bloco.ALTURA_PADRAO * 4;
    Dimension tamanho = new Dimension(larguraMinima + 2, alturaMinima + 2);

    setMinimumSize(tamanho);
    setPreferredSize(tamanho);
    setMaximumSize(tamanho);

    setBackground(Color.BLACK);
  }

  /**
   * Desenha a peça especificada no painel.
   * 
   * @param peca peça que será desenhada
   */
  public void desenharPeca(Peca peca) {
    this.pecaDesenhada = peca;
    repaint();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    if (pecaDesenhada != null) {
      int largura = Bloco.LARGURA_PADRAO * pecaDesenhada.largura();
      int altura = Bloco.ALTURA_PADRAO * pecaDesenhada.altura();
      int mtp = (pecaDesenhada instanceof PecaI) ? 3 : 1;
      int x = (getWidth() - largura + Bloco.LARGURA_PADRAO * mtp) / 2;
      int y = (getHeight() - altura - Bloco.ALTURA_PADRAO) / 2;

      Desenhista.desenharPeca(g, pecaDesenhada, x, y, 255);
    }
  }
}