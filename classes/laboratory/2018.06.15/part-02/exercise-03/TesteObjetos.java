import estrutura.ListaLigada;

public class TesteObjetos {

  public static void main(String[] args) {
    ListaLigada listaL = new ListaLigada();
    listaL.adicionaOrdenado(5);
    listaL.adicionaOrdenado(6);
    listaL.adicionaOrdenado(90);
    listaL.adicionaOrdenado(94);
    listaL.adicionaOrdenado(150);
    listaL.imprimeListaLigada();
    listaL.adicionaOrdenado(92);
    listaL.imprimeListaLigada();
  } 

}