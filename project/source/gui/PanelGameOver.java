package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import tetris.Configuracao;
import tetris.Tabuleiro;

public class PanelGameOver extends PanelBase {

  private JLabel labelPontuacao;
  private JLabel labelLinhas;
  private JLabel labelNivel;

  private Configuracao configuracao;

  public PanelGameOver() {
    super("/resources/img/fundo_gameover.png");
  }

  @Override
  protected void configurarLayout() {
    super.configurarLayout();

    add(Box.createRigidArea(new Dimension(0, 250)));

    add(criarResumo());
    add(Box.createRigidArea(new Dimension(0, 30)));
    add(criarOpcoes());

    add(Box.createVerticalGlue());
  }

  /**
   * Cria o painel com a pontuação do jogo finalizado.
   * 
   * @return painel com o resumo
   */
  private JPanel criarResumo() {
    JPanel panel = new JPanel();
    panel.setOpaque(false);
    panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
    Dimension padding = new Dimension(10, 0);

    labelPontuacao = GUIUtil.criarLabelPontos();
    panel.add(GUIUtil.criarMostrador("Placar", labelPontuacao, 110, 85));
    panel.add(Box.createRigidArea(padding));

    labelNivel = GUIUtil.criarLabelPontos();
    panel.add(GUIUtil.criarMostrador("N\u00EDvel", labelNivel, 110, 85));
    panel.add(Box.createRigidArea(padding));

    labelLinhas = GUIUtil.criarLabelPontos();
    panel.add(GUIUtil.criarMostrador("Linhas", labelLinhas, 110, 85));

    return panel;
  }

  /**
   * Cria um mostrador com as opções de voltar ao início
   * e de começar um jogo com a mesma dificuldade novamente.
   * 
   * @return mostrador com as opções
   */
  private MostradorJogo criarOpcoes() {
    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

    panel.add(GUIUtil.criarBotao("In\u00EDcio", 152, e -> {
      GUIUtil.getJanelaPrincipal(PanelGameOver.this).mostrarInicio();
    }));
    panel.add(Box.createRigidArea(new Dimension(10, 10)));
    panel.add(GUIUtil.criarBotao("Jogar", 152, e -> {
      GUIUtil.getJanelaPrincipal(PanelGameOver.this).mostrarJogo(configuracao);
    }));

    return GUIUtil.criarMostrador("Op\u00E7\u00F5es", panel);
  }

  /**
   * Mostra os dados do tabuleiro finalizado, com a configuração.
   * 
   * @param tabuleiro tabuleiro finalizado
   * @param configuracao configuração do tabuleiro finalizado
   */
  public void mostrarDados(Tabuleiro tabuleiro, Configuracao configuracao) {
    this.configuracao = configuracao;

    GUIUtil.mostrarDado(labelLinhas, tabuleiro.getLinhasEliminadas());
    GUIUtil.mostrarDado(labelNivel, tabuleiro.getNivel());
    GUIUtil.mostrarDado(labelPontuacao, tabuleiro.getPlacar());
  }
  
}