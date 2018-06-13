import estruturasdedados.ListaFacil;
import espaco.*;

public class TesteObjetos {

  public static void main(String[] args) {
    // Parte 1.
    /* DiscoVoador discoVoadorAzul = new DiscoVoador();
    discoVoadorAzul.setCor("Azul");
    discoVoadorAzul.darPartida();

    DiscoVoador discoVoadorVerde = new DiscoVoador();
    discoVoadorVerde.setCor("Verde");
    discoVoadorVerde.darPartida(); */

    // Parte 2.
    /* ListaFacil lista = new ListaFacil();
    lista.iniciaLista(3);
    lista.adicionarItem(9);
    lista.adicionarItem(10);
    lista.adicionarItem(11);
    lista.adicionarItem(12); // Erro.
    System.out.println(lista.lerItem(0));
    System.out.println(lista.lerItem(1));
    System.out.println(lista.lerItem(2));
    System.out.println(lista.lerItem(3)); // Erro. */

    // Parte 3.
    DiscoVoador discoVoadorAzul = new DiscoVoador();
    discoVoadorAzul.setCor("Azul");
    System.out.println(discoVoadorAzul);

    PortaDiscosVoadores portaDiscos = new PortaDiscosVoadores();
    portaDiscos.estacionarDisco(discoVoadorAzul);
    System.out.println(portaDiscos.liberarDisco(0));
  }

}