package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public abstract class PanelBase extends JPanel {

  private String imagemDeFundo;

  public PanelBase() {
    // Método vazio.
  }

  public PanelBase(String imagemDeFundo) {
    this.imagemDeFundo = imagemDeFundo;
    configurarLayout();
  }

  public void setImagemDeFundo(String imagemDeFundo) {
    this.imagemDeFundo = imagemDeFundo;
    repaint();
  }

  public String getImagemDeFundo() {
    return imagemDeFundo;
  }

  /**
   * Configura o layout do panel.
   */
  protected void configurarLayout() {
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    setPreferredSize(new Dimension(JanelaPrincipal.ALTURA_PADRAO, JanelaPrincipal.LARGURA_PADRAO));
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    if (imagemDeFundo != null) {
      Image fundo = new ImageIcon(getClass().getResource(imagemDeFundo)).getImage();
      g.drawImage(fundo, 0, 0, this);
    }
  }

}