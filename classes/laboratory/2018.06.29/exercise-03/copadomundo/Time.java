package copadomundo;

import copadomundo.Jogador;

public class Time {
  private String nome;
  private Jogador[] jogadores;

  public Time(String nome) {
    jogadores = new Jogador[11];
    this.nome = nome;
  }

  public void adicionarJogador(Jogador jogador) throws Exception {
    int i;
    // Procura uma posição null.
    for (i = 0; i < jogadores.length && jogadores[i] != null; i++);
    // Se o vetor não possui mais posições disponíveis.
    if (i >= jogadores.length)
      throw new Exception("Escalação cheia.");
    // Adiciona no vetor.
    jogadores[i] = jogador;
    // Ordena o vetor.
    ordenarTime();
  }

  private void ordenarTime() {
    int i, j;
    Jogador chave = null;
    for (i = 1; i < jogadores.length; i++) {
      chave = jogadores[i];
      j = i - 1;

      if (chave != null) {
        while (j >= 0 && jogadores[j] != null &&
          jogadores[j].getNumeroCamisa() > chave.getNumeroCamisa()) {
          jogadores[j + 1] = jogadores[j];
          j = j - 1;
        }
      }
      jogadores[j + 1] = chave;
    }
  }

  public void substituirJogador(int jogadorSubstituido,
    Jogador jogadorSubstituto) {
    for (int i = 0; i < jogadores.length; i++) {
      if (jogadores[i].getNumeroCamisa() == jogadorSubstituido) {
        jogadores[i] = jogadorSubstituto;
        break;
      }
    }
    // Ordena o vetor.
    ordenarTime();
  }

  public void imprimirEscalacao() {
    System.out.println(nome);
    for (Jogador jogador : jogadores) {
      if (jogador != null)
        System.out.println("- " + jogador);
    }
    System.out.print("\n");
  }

  private boolean verificaTime() {
    boolean possuiGoleiro = false;

    for (int i = 0; i < jogadores.length; i++) {
      if (jogadores[i] == null)
        return false;

      if (jogadores[i] instanceof Goleiro) {
        if (possuiGoleiro)
          return false;
        possuiGoleiro = true;
      }
    }

    return true;
  }
}