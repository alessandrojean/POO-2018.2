package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

import tetris.Bloco;
import tetris.peca.Peca;

public class Desenhista {
  /**
   * Desenha a peça {@code p}, em ({@code x}, {@code y}),
   * com a opacidade {@code alpha}, utilizando {@code g}.
   * 
   * @param g instância de Graphics
   * @param p peça que será desenhada
   * @param x x da peça
   * @param y y da peça
   * @param alpha opacidade da peça
   */
  public static void desenharPeca(Graphics g, Peca p, int x, int y, int alpha) {
    for (int i = 0; i < p.quantidadeDeBlocos(); i++) {
      Bloco blocoAtual = p.blocoNaPosicao(i);
      int blocoX = x + blocoAtual.getX() * Bloco.LARGURA_PADRAO;
      int blocoY = y + blocoAtual.getY() * Bloco.ALTURA_PADRAO;
      desenharBloco(g, blocoAtual, blocoX, blocoY, alpha);
    }
  }

  /**
   * Desenha o bloco {@code b}, em ({@code x}, {@code y}),
   * com a opacidade {@code alpha}, utilizando {@code g}.
   * 
   * @param g instância de Graphics
   * @param b bloco que será desenhado
   * @param x x absoluto do bloco
   * @param y y absoluto do bloco
   * @param alpha opacidade do bloco
   */
  public static void desenharBloco(Graphics g, Bloco b, int x, int y, int alpha) {
    Graphics2D g2d = (Graphics2D) g;
    Color cor = ColorUtil.clonarComAlpha(b.getCor(), alpha);
    Color corClara = ColorUtil.clonarComAlpha(b.getCorClara(), alpha);
    Color corEscura = ColorUtil.clonarComAlpha(b.getCorEscura(), alpha);

    x += 2;
    y += 2;

    int larguraTotal = Bloco.LARGURA_PADRAO - 2;
    int alturaTotal = Bloco.ALTURA_PADRAO - 2;
    int larguraInterior = (int)(0.625 * larguraTotal);
    int alturaInterior = (int)(0.625 * alturaTotal);
    int xInterior = x + (int)(0.1875 * larguraTotal);
    int yInterior = y + (int)(0.1875 * larguraTotal);

    // Desenha o triângulo escuro.
    g2d.setColor(corEscura);
    Path2D.Double trianguloEscuro = new Path2D.Double();
    trianguloEscuro.moveTo(x, y);
    trianguloEscuro.lineTo(xInterior, yInterior);
    trianguloEscuro.lineTo(xInterior, yInterior + alturaInterior);
    trianguloEscuro.lineTo(xInterior + larguraInterior, yInterior + alturaInterior);
    trianguloEscuro.lineTo(x + larguraTotal, y + alturaTotal);
    trianguloEscuro.lineTo(x, y + alturaTotal);
    trianguloEscuro.closePath();
    g2d.fill(trianguloEscuro);

    // Desenha o triângulo claro.
    g2d.setColor(corClara);
    Path2D.Double trianguloClaro = new Path2D.Double();
    trianguloClaro.moveTo(x + larguraTotal, y + alturaTotal);
    trianguloClaro.lineTo(x + larguraTotal, y);
    trianguloClaro.lineTo(x, y);
    trianguloClaro.lineTo(xInterior, yInterior);
    trianguloClaro.lineTo(xInterior + larguraInterior, yInterior);
    trianguloClaro.lineTo(xInterior + larguraInterior, yInterior + alturaInterior);
    trianguloClaro.closePath();
    g2d.fill(trianguloClaro);

    // Desenha o quadrado interior.
    g2d.setColor(cor);
    g2d.fillRect(xInterior, yInterior, larguraInterior, alturaInterior);
  }
  
}