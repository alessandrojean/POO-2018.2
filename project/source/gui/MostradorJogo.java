package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MostradorJogo extends JPanel {

  private JLabel titulo;
  private JComponent componente;

  public MostradorJogo(String titulo, JComponent componente) {
    this.componente = componente;

    configurarLayout(titulo);
  }

  /**
   * Configura o layout do painel.
   * 
   * @param titulo titulo do mostrador
   */
  private void configurarLayout(String titulo) {
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    setBorder(BorderFactory.createEmptyBorder(5, 5, 15, 10));

    JLabel labelTitulo = new JLabel(titulo.toUpperCase());
    labelTitulo.setAlignmentX(JComponent.CENTER_ALIGNMENT);
    labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
    labelTitulo.setFont(labelTitulo.getFont().deriveFont(Font.BOLD));
    labelTitulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
    labelTitulo.setForeground(Color.WHITE);
    add(labelTitulo);

    add(Box.createRigidArea(new Dimension(0, 5)));

    componente.setAlignmentX(JComponent.CENTER_ALIGNMENT);
    add(componente);

    add(Box.createRigidArea(new Dimension(0, 5)));
  }

  public JComponent getComponente() {
    return componente;
  }

  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    g2d.setColor(new Color(0, 0, 0, 50));
    g2d.fillRoundRect(4, 4, getWidth() - 5, getHeight() - 10, 12, 12);

    GradientPaint gradiente = new GradientPaint(0, 0, new Color(6, 78, 158), 0, 22, new Color(0, 144, 224));
    g2d.setPaint(gradiente);

    //g2d.setColor(new Color(0, 90, 156));
    g2d.fillRoundRect(0, 0, getWidth() - 5, getHeight() - 10, 10, 10);

    Color sombra = ColorUtil.ehEscura(getBackground())
      ? getBackground().brighter()
      : getBackground().darker();

    g2d.setColor(sombra);
    g2d.fillRoundRect(0, 22, getWidth() - 5, getHeight() - 37, 10, 10);

    g2d.setColor(getBackground());
    g2d.fillRoundRect(0, 24, getWidth() - 5, getHeight() - 41, 9, 9);
  }

}