package tetris;

import java.awt.Color;

public class Bloco {
  public static final int LARGURA_PADRAO = 18;
  public static final int ALTURA_PADRAO = 18;

  private int x;
  private int y;

  private Color cor;
  private Color corEscura;
  private Color corClara;

  public Bloco(int x, int y) {
    setX(x);
    setY(y);
  }

  public Bloco(int x, int y, Bloco b) {
    setX(x);
    setY(y);
    setCor(b.cor);
    setCorEscura(b.corEscura);
    setCorClara(b.corClara);
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getX() {
    return x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getY() {
    return y;
  }

  public void setCor(Color cor) {
    this.cor = cor;
  }

  public Color getCor() {
    return cor;
  }

  public void setCorEscura(Color corEscura) {
    this.corEscura = corEscura;
  }

  public Color getCorEscura() {
    return corEscura;
  }

  public void setCorClara(Color corClara) {
    this.corClara = corClara;
  }

  public Color getCorClara() {
    return corClara;
  }

  @Override
  public String toString() {
    return "Bloco[x=" + x + ", y=" + y + "]";
  }
}