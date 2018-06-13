package espaco;

public class PortaDiscosVoadores {
  private DiscoVoador[] discos = new DiscoVoador[3];

  private int encontraIndiceLivre() {
    for (int i = 0; i < discos.length; i++) {
      if (discos[i] == null)
        return i;
    }
    return -1;
  }

  public void estacionarDisco(DiscoVoador disco) {
    int i = encontraIndiceLivre();
    if (i == -1) {
      System.out.println("Não há vagas!");
      return;
    }
    discos[i] = disco;
    disco.estacionado = true;
  }

  public DiscoVoador liberarDisco(int indice) {
    if (indice >= discos.length) {
      System.out.println("Posição inválida!");
      return null;
    }
    return discos[indice];
  }
}