package gui;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tetris.Configuracao;
import tetris.Tabuleiro;

public class JanelaPrincipal extends JFrame{

  public static final int ALTURA_PADRAO = 600;
  public static final int LARGURA_PADRAO = ALTURA_PADRAO;

  private static final String TELA_INICIO = "Inicio";
  private static final String TELA_JOGO = "Jogo";
  private static final String TELA_GAMEOVER = "GameOver";

  private String telaAtual = TELA_JOGO;

  private PanelInicio panelInicio;
  private PanelJogo panelJogo;
  private PanelGameOver panelGameOver;
  
  public JanelaPrincipal() {
    setTitle("Tetris");
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    // Define o ícone.
    Image icone16 = new ImageIcon(getClass().getResource("/resources/img/icone16.png")).getImage();
    Image icone32 = new ImageIcon(getClass().getResource("/resources/img/icone32.png")).getImage();
    Image icone96 = new ImageIcon(getClass().getResource("/resources/img/icone96.png")).getImage();
    setIconImages(Arrays.asList(icone16, icone32, icone96));

    setContentPane(new JPanel(new CardLayout()));

    panelInicio = new PanelInicio();
    getContentPane().add(panelInicio, TELA_INICIO);

    panelJogo = new PanelJogo();
    getContentPane().add(panelJogo, TELA_JOGO);

    panelGameOver = new PanelGameOver();
    getContentPane().add(panelGameOver, TELA_GAMEOVER);
  }

  /**
   * Mostra a tela {@code tela} na janela.
   * 
   * @param tela tela que será mostrada, se existir
   */
  private void mostrarTela(String tela) {
    telaAtual = tela;

    CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
    cardLayout.show(getContentPane(), tela);
  }

  /**
   * Mostra a tela de início.
   */
  public void mostrarInicio() {
    mostrarTela(TELA_INICIO);
  }

  /**
   * Mostra a tela do jogo, com as configurações especificadas.
   * 
   * @param configuracao configuração do jogo
   */
  public void mostrarJogo(Configuracao configuracao) {
    mostrarTela(TELA_JOGO);
    panelJogo.comecarJogo(configuracao);
  }

  /**
   * Mostra a tela de game over, com o placar de {@code tabuleiroFinal},
   * mostrando um botão para iniciar o jogo baseado na {@code configuracao}.
   * 
   * @param tabuleiroFinal tabuleiro ao fim de jogo
   * @param configuracao configuracao do jogo que terminou
   */
  public void mostrarGameOver(Tabuleiro tabuleiroFinal, Configuracao configuracao) {
    mostrarTela(TELA_GAMEOVER);
    panelGameOver.mostrarDados(tabuleiroFinal, configuracao);
  }
}