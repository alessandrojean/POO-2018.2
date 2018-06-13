package estruturasdedados;

import espaco.DiscoVoador;

public class ListaFacilDiscosVoadores {

  private DiscoVoador[] itens;
  private int indice = 0;

  public void iniciaLista(int tamanhoMax) {
    this.itens = new DiscoVoador[tamanhoMax];
    this.indice = 0;
  }

  public void adicionarItem(DiscoVoador novoItem) {
    if (this.indice >= this.itens.length) {
      System.out.println("Lista cheia!");
      return;
    }

    this.itens[this.indice] = novoItem;
    this.indice++;
  }

  public DiscoVoador lerItem(int indice) {
    if (indice >= this.itens.length) {
      System.out.println("Posição inválida!");
      return null;
    }

    return this.itens[indice];
  }

  public void removerItem(int indice) {
    if (indice >= this.itens.length) {
      System.out.println("Posição inválida!");
      return;
    }

    this.itens[indice] = null;
  }

}