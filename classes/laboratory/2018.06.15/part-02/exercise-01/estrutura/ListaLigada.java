package estrutura;

public class ListaLigada {

  private class LinkedNode {
    int data;
    LinkedNode next = null;
  }

  private LinkedNode first = null;

  /**
   * Adiciona o {@code item} ao final da lista
   * simplesmente ligada.
   * 
   * @param item item a ser adicionado
   */
  public void adicionaItemNoFinal(int item) {
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
   * Remove o {@code item}, se existir, da
   * lista simplesmente ligada.
   * 
   * @param item item a ser removido
   */
  public void removeItem(int item) {
    LinkedNode previous = null, current;
    for (current = first; current != null && current.data != item;
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
      System.out.print(node.data + " ");
    }
    System.out.print("\n");
  }

  /**
   * Busca um {@code item} na lista simplesmente
   * ligada, retornando verdadeiro se o encontrar.
   * 
   * @param item item a ser procurado
   * @return {@code true} se encontrar o {@code item}
   */
  public boolean buscar(int item) {
    for (LinkedNode node = first; node != null; node = node.next) {
      if (node.data == item)
        return true;
    }
    return false;
  }
  
}