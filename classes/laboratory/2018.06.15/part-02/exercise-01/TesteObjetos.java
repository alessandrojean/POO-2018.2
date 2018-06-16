import estrutura.ListaLigada;

public class TesteObjetos {

  public static void main(String[] args) {
    ListaLigada listaL = new ListaLigada();
    listaL.adicionaItemNoFinal(5);
    listaL.adicionaItemNoFinal(35);
    listaL.adicionaItemNoFinal(20);
    listaL.adicionaItemNoFinal(70);
    listaL.adicionaItemNoFinal(2);
    listaL.imprimeListaLigada();
    listaL.removeItem(20);
    listaL.imprimeListaLigada();

    System.out.println(listaL.buscar(5));
    System.out.println(listaL.buscar(20));
  } 

}