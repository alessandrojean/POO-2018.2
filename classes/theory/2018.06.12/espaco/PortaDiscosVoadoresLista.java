package espaco;

import estruturasdedados.ListaFacilDiscosVoadores;

public class PortaDiscosVoadores {
  private ListaFacilDiscosVoadores discos = new ListaFacilDiscosVoadores();

  public PortaDiscosVoadores() {
    discos.iniciaLista(3);
  }

  public void estacionarDisco(DiscoVoador disco) {
    discos.adicionarItem(disco);
    disco.estacionado = true;
  }

  public DiscoVoador liberarDisco(int indice) {
    Disco disco = discos.lerItem(indice);
    discos.removerItem(indice);
    return disco;
  }
}