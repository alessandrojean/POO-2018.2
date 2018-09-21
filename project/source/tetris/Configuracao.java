package tetris;

public class Configuracao {
  private int delay = 0;
  private int dificuldade = 1;
  private int quantidadeColunas = 10;
  private int quantidadeLinhas = 20;

  private static final Configuracao[] CONFIGURACOES = new Configuracao[]{
    new Configuracao(600, 1, 10, 20),
    new Configuracao(400, 2, 10, 20), 
    new Configuracao(300, 2, 12, 22)
  };

  /**
   * Configuração para o nível fácil.
   */
  public static final int FACIL = 0;
  /**
   * Configuração para o nível médio.
   */
  public static final int MEDIO = 1;
  /**
   * Configuração para o nível alto.
   */
  public static final int DIFICIL = 2;

  private Configuracao(int delay, int dificuldade, int colunas, int linhas) {
    this.delay = delay;
    this.dificuldade = dificuldade;
    this.quantidadeColunas = colunas;
    this.quantidadeLinhas = linhas;
  }

  public int getDelay() {
    return delay;
  }

  public int getDificuldade() {
    return dificuldade;
  }

  public int getQuantidadeColunas() {
    return quantidadeColunas;
  }

  public int getQuantidadeLinhas() {
    return quantidadeLinhas;
  }

  public boolean getMostrarPrevisao() {
    return this.dificuldade == 1;
  }

  /**
   * Retorna uma configuração baseada em {@code i}.
   * 
   * @param i configuração desejada
   * @return configuração, se existir
   */
  public static Configuracao getConfiguracao(int i) {
    return CONFIGURACOES[i];
  }
  
}