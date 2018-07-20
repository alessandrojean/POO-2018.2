package estrutura;

import estrutura.PilhaException;

/**
 * PilhaCheiaException
 */
public class PilhaCheiaException extends PilhaException {
  private int limite;
  private Object item;

  public PilhaCheiaException(int limite, Object item) {
    super("A pilha está cheia.");
    this.limite = limite;
    this.item = item;
  }

  public int getLimite() {
    return limite;
  }

  public Object getItem() {
    return item;
  }
}