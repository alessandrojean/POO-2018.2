package estruturasdedados;

public class ListaFacil {

  private int[] itens;
  private int indice = 0;

  public void iniciaLista(int tamanhoMax) {
    this.itens = new int[tamanhoMax];
    this.indice = 0;
  }

  public void adicionarItem(int novoItem) {
    if (this.indice >= this.itens.length) {
      System.out.println("Lista cheia!");
      return;
    }

    this.itens[this.indice] = novoItem;
    this.indice++;
  }

  public int lerItem(int indice) {
    if (indice >= this.itens.length) {
      System.out.println("Posição inválida!");
      return 0;
    }

    return this.itens[indice];
  }

}