package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


import gui.JanelaPrincipal;
import gui.MostradorJogo;

public class GUIUtil {
  /**
   * Retorna a instância da janela principal com
   * base no {@code component}.
   * 
   * @param component componente contido na janela principal
   * @return instância da janela principal
   */
  public static JanelaPrincipal getJanelaPrincipal(Component component) {
    return (JanelaPrincipal) SwingUtilities.getWindowAncestor(component);
  }

  /**
   * Cria a label personalizada para exibição dos pontos.
   * 
   * @return label com texto zerado
   */
  public static JLabel criarLabelPontos() {
    JLabel label = new JLabel("0");
    label.setForeground(new Color(0, 90, 156));
    label.setAlignmentX(JComponent.LEFT_ALIGNMENT);

    Font fonte = label.getFont();
    label.setFont(fonte.deriveFont(Font.BOLD).deriveFont(30f));

    return label;
  }

  /**
   * Mostra o conteúdo de {@code valor} em {@code label}.
   * 
   * @param label label que será mostrado o valor
   * @param valor conteúdo a ser mostrado
   */
  public static void mostrarDado(JLabel label, int valor) {
    if (label != null)
      label.setText(String.valueOf(valor));
  }

  /**
   * Cria um botão com a identidade visual do jogo.
   * 
   * @param texto texto do botão
   * @param largura largura máxima do botão
   * @param al evento de clique
   */
  public static JButton criarBotao(String texto, int largura, ActionListener al) {
    JButton botao = new JButton(texto.toUpperCase());
    botao.setAlignmentX(JComponent.CENTER_ALIGNMENT);
    botao.setOpaque(false);

    Font fonte = botao.getFont();
    botao.setFont(fonte.deriveFont(18f));

    botao.setMaximumSize(new Dimension(largura, 35));
    botao.addActionListener(al);

    return botao;
  }

  /**
   * Cria um mostrador do jogo.
   * 
   * @param titulo titulo do mostrador
   * @param componente componente interno do mostrador
   * @return instância nova de um mostrador
   */
  public static MostradorJogo criarMostrador(String titulo, JComponent componente) {
    return new MostradorJogo(titulo, componente);
  }

  /**
   * Cria um mostrador do jogo.
   * 
   * @param titulo titulo do mostrador
   * @param componente componente interno do mostrador
   * @param largura largura máxima
   * @param altura altura máxima
   */
  public static MostradorJogo criarMostrador(String titulo, JComponent componente, int largura, int altura) {
    MostradorJogo mostrador = criarMostrador(titulo, componente);
    mostrador.setPreferredSize(new Dimension(110, 85));
    mostrador.setMaximumSize(new Dimension(110, 85));
    return mostrador;
  }
  
}