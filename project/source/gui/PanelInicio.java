package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import tetris.Configuracao;

public class PanelInicio extends PanelBase {

  public PanelInicio() {
    super("/resources/img/fundo_inicio.png");
  }

  @Override
  protected void configurarLayout() {
    super.configurarLayout();

    // Adiciona o espaço superior.
    add(Box.createRigidArea(new Dimension(0, 280)));
    
    add(criarPainelDificuldades());

    // Adiciona o espaçamento da label de informações.
    add(Box.createRigidArea(new Dimension(0, 30)));

    // Adiciona a label de informações.
    JLabel labelInformacoes = new JLabel();
    labelInformacoes.setText(
      "<html><center>" +
      "Projeto final da disciplina de <b>POO</b> - 2018.2 - UFABC<br/>" +
      "Tetris \u00AE & \u00A9 1985~2018 Tetris Holding." +
      "</center></html>"
    );
    labelInformacoes.setHorizontalAlignment(SwingConstants.CENTER);
    labelInformacoes.setAlignmentX(JComponent.CENTER_ALIGNMENT);
    labelInformacoes.setForeground(new Color(0, 90, 156));
    add(labelInformacoes);
  }

  /**
   * Cria um mostrador com as opções de escolha de dificuldade.
   * 
   * @return mostrador com as opções
   */
  private MostradorJogo criarPainelDificuldades() {
    JPanel panelBotoes = new JPanel();
    panelBotoes.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    panelBotoes.setLayout(new BoxLayout(panelBotoes, BoxLayout.Y_AXIS));
    Dimension padding = new Dimension(0, 10);

    panelBotoes.add(GUIUtil.criarBotao("F\u00E1cil", 100, e -> {
      Configuracao config = Configuracao.getConfiguracao(Configuracao.FACIL);
      GUIUtil.getJanelaPrincipal(PanelInicio.this).mostrarJogo(config);
    }));
    panelBotoes.add(Box.createRigidArea(padding));
    panelBotoes.add(GUIUtil.criarBotao("M\u00E9dio", 100, e -> {
      Configuracao config = Configuracao.getConfiguracao(Configuracao.MEDIO);
      GUIUtil.getJanelaPrincipal(PanelInicio.this).mostrarJogo(config);
    }));
    panelBotoes.add(Box.createRigidArea(padding));
    panelBotoes.add(GUIUtil.criarBotao("Dif\u00EDcil", 100, e -> {
      Configuracao config = Configuracao.getConfiguracao(Configuracao.DIFICIL);
      GUIUtil.getJanelaPrincipal(PanelInicio.this).mostrarJogo(config);
    }));

    return GUIUtil.criarMostrador("Dificuldade", panelBotoes);
  }

}