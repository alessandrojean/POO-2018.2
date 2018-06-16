package estrutura;

import pctbanco.Conta;

public class ListaLigada {

  private class LinkedNode {
    Conta data;
    LinkedNode next = null;
  }

  private LinkedNode first = null;

  /**
   * Adiciona a conta {@code item} ao final da lista
   * simplesmente ligada.
   * 
   * @param item item a ser adicionado
   */
  public void adicionaItemNoFinal(Conta item) {
    LinkedNode newItem = new LinkedNode();
    newItem.data = item;
    
    if (this.first == null) {
      this.first = newItem;
    } else {
      LinkedNode previous = null, current;
      for (current = first; current != null;
           previous = current, current = current.next);
      previous.next = newItem;
    }
  }

  /**
   * Remove a conta {@code id}, se existir, da
   * lista simplesmente ligada.
   * 
   * @param id id da conta a ser removido
   */
  public void removeItem(int id) {
    LinkedNode previous = null, current;
    for (current = first; current != null && current.data.getId() != id;
         previous = current, current = current.next);
    if (current != null) {
      if (previous == null) {
        first = current.next;
      } else {
        previous.next = current.next;
      }
    }
  }

  /**
   * Imprime a lista simplesmente ligada.
   */
  public void imprimeListaLigada() {
    for (LinkedNode node = first; node != null; node = node.next) {
      node.data.imprimirSaldo();
    }
  }

  /**
   * Busca um {@code id} na lista simplesmente
   * ligada, retornando verdadeiro se o encontrar.
   * 
   * @param id id da conta a ser procurado
   * @return {@code true} se encontrar o {@code item}
   */
  public boolean buscar(int id) {
    for (LinkedNode node = first; node != null; node = node.next) {
      if (node.data.getId() == id)
        return true;
    }
    return false;
  }
  
}