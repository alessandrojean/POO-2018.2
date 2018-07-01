package futebol;

public class Time {
  private Jogador[] jogadores = new Jogador[11];
  private int indiceAtual = 0;

  public void adicionaJogador(Jogador jogador) {
    if (indiceAtual + 1 > jogadores.length)
      return;

    jogadores[indiceAtual++] = jogador;
  }

  public void adicionaJogador(String nome, String NI) throws Exception {
    Jogador jogador = new Jogador(nome, NI);

    if (indiceAtual + 1 > jogadores.length)
      return;

    jogadores[indiceAtual++] = jogador;
  }

  public void removerJogador(String NI) {
    int max = (indiceAtual + 1) >= jogadores.length 
      ? jogadores.length : indiceAtual;
    for (int i = 0; i < max; i++) {
      if (NI.equals(jogadores[i].getNI())) {
        for (int j = i + 1; j < max; j++) {
          jogadores[j - 1] = jogadores[j];
        }
        indiceAtual--;
        break;
      }
    }
  }

  public void imprimeEscalacao() {
    int max = (indiceAtual + 1) >= jogadores.length 
      ? jogadores.length : indiceAtual;
    for (int i = 0; i < max; i++) {
      System.out.printf("[Nome = %s, NI = %s]\n", 
        jogadores[i].getNome(), jogadores[i].getNI());
    }
  }

}