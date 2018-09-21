package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import tetris.Configuracao;
import tetris.Tabuleiro;

/**
 * Classe responsável pelo painel do jogo.
 */
public class PanelJogo extends PanelBase implements ActionListener, KeyListener {

  private Tabuleiro tabuleiro;
  private PanelTabuleiro panelTabuleiro;

  private Timer timer;
  private boolean estaPausado = false;

  // Componentes
  private JLabel labelPontuacao;
  private JLabel labelLinhas;
  private JLabel labelNivel;
  private PanelProximaPeca panelProxima;

  private Configuracao configuracao;

  public PanelJogo() {
    setImagemDeFundo("/resources/img/fundo_jogo.png");
    repaint();

    configurarLayout();
    //configurarJogo(configuracaoEscolhida.dificuldade);
  }

  @Override
  protected void configurarLayout() {
    setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    addKeyListener(this);

    add(Box.createHorizontalGlue());

    criarPanelPlacar();

    add(Box.createRigidArea(new Dimension(50, 0)));

    panelTabuleiro = new PanelTabuleiro(tabuleiro);
    add(new MostradorJogo("Tabuleiro", panelTabuleiro));

    add(Box.createHorizontalGlue());
  }

  /**
   * Cria o painel que mostra o placar.
   */
  private void criarPanelPlacar() {
    // Panel responsável pelos placares.
    JPanel panelPlacar = new JPanel();
    panelPlacar.setLayout(new BoxLayout(panelPlacar, BoxLayout.Y_AXIS));
    panelPlacar.setPreferredSize(new Dimension(110, 250));
    panelPlacar.setBackground(null);
    panelPlacar.setOpaque(false);
    add(panelPlacar);

    panelProxima = new PanelProximaPeca();
    MostradorJogo proximo = new MostradorJogo("Pr\u00F3xima", panelProxima);
    proximo.setBackground(Color.BLACK);
    panelPlacar.add(proximo);

    labelPontuacao = GUIUtil.criarLabelPontos();
    panelPlacar.add(GUIUtil.criarMostrador("Placar", labelPontuacao, 110, 85));

    labelNivel = GUIUtil.criarLabelPontos();
    panelPlacar.add(GUIUtil.criarMostrador("N\u00EDvel", labelNivel, 110, 85));

    labelLinhas = GUIUtil.criarLabelPontos();
    panelPlacar.add(GUIUtil.criarMostrador("Linhas", labelLinhas, 110, 85));

    add(panelPlacar);
  }

  /**
   * Configura o jogo baseando-se nas configurações passadas.
   */
  private void configurarJogo() {
    this.panelTabuleiro.setDesenharPrevisao(configuracao.getMostrarPrevisao());
    timer = new Timer(configuracao.getDelay(), this);
    tabuleiro = new Tabuleiro(configuracao.getQuantidadeLinhas(),
      configuracao.getQuantidadeColunas());
    this.panelTabuleiro.setTabuleiro(tabuleiro);

    GUIUtil.mostrarDado(labelLinhas, 0);
    GUIUtil.mostrarDado(labelNivel, 0);
    GUIUtil.mostrarDado(labelPontuacao, 0);
    panelProxima.desenharPeca(tabuleiro.getProximaPeca());

    // Redesenha para corrigir o tamanho.
    repaint();
  }
  
  /**
   * Inicia o timer que é responsável pelo Jogo.
   * 
   * @param configuracao configuração do jogo
   */
  public void comecarJogo(Configuracao configuracao) {
    this.configuracao = configuracao;
    configurarJogo();

    timer.start();
    requestFocusInWindow();
  }

  @Override
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
      timer.stop();
      GUIUtil.getJanelaPrincipal(this).mostrarInicio();
    }

    if (e.getKeyCode() == KeyEvent.VK_P) {
      estaPausado = !estaPausado;
      if (estaPausado)
        timer.stop();
      else
        timer.start();
    }
      
    if (timer.isRunning()) {
      panelTabuleiro.onTeclaPressionada(e.getKeyCode());

      if (e.getKeyCode() == KeyEvent.VK_SPACE) {
        atualizarInformacoes();
        verificarFim();
      }
    }

    if (e.getKeyCode() == KeyEvent.VK_R && tabuleiro.acabou()
      && !timer.isRunning())
      timer.start();
  }

  @Override
  public void keyReleased(KeyEvent e) {}

  @Override
  public void keyTyped(KeyEvent e) {}

  @Override
  public void actionPerformed(ActionEvent e) {
    if (tabuleiro.acabou()) {
      timer.stop();
      verificarFim();
      return;
    }

    atualizarInformacoes();
  }

  /**
   * Verifica se o jogo acabou. Se sim, mostra a tela de game over.
   */
  private void verificarFim() {
    if (tabuleiro.acabou()) {
      GUIUtil.getJanelaPrincipal(this).mostrarGameOver(tabuleiro, configuracao);
    }
  }

  /**
   * Atualiza as informações do jogo durante o mesmo.
   */
  private void atualizarInformacoes() {
    panelTabuleiro.onTeclaPressionada(KeyEvent.VK_DOWN);
    GUIUtil.mostrarDado(labelLinhas, tabuleiro.getLinhasEliminadas());
    GUIUtil.mostrarDado(labelNivel, tabuleiro.getNivel());
    GUIUtil.mostrarDado(labelPontuacao, tabuleiro.getPlacar());
    panelProxima.desenharPeca(tabuleiro.getProximaPeca());
  }
  
}