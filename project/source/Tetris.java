import javax.swing.UIManager;

import gui.JanelaPrincipal;

public class Tetris {
  public static void main(String[] args) {
    configurarLookAndFeel();

    JanelaPrincipal janela = new JanelaPrincipal();
    janela.setResizable(false);
    janela.pack();
    janela.setLocationRelativeTo(null);
    janela.setVisible(true);
  }

  /**
   * Tenta definir o Look and Feel para o do sistema.
   * Caso não for possível, emite uma mensagem de erro
   * no console e utiliza o tema Metal do Swing.
   */
  private static void configurarLookAndFeel() {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
      System.out.println("Não foi possível definir o Look and Feel, utilizando o Metal.");
    }
  }
}