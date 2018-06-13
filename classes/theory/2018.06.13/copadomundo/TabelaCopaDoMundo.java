package copadomundo;

public class TabelaCopaDoMundo {

  private Jogo[] jogos;
  private int indice;

  public void iniciaListaDeJogos(int tamMax) {
    this.jogos = new Jogo[tamMax];
    this.indice = 0;
  }

  public void adicionaJogo(Jogo jogo) {
    if (this.indice >= this.jogos.length) {
      System.out.println("Lista de jogos cheia.");
      return;
    }
    this.jogos[this.indice++] = jogo;
  }

  public Jogo lerJogo(int indice) {
    if (this.indice >= this.jogos.length) {
      System.out.println("Posição inválida.");
      return null;
    }
    return jogos[indice];
  }

}