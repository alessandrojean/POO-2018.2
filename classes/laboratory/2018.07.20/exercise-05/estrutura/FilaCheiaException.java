package estrutura;

public class FilaCheiaException extends FilaException {
  private int limite;
  private Object item;

  public FilaCheiaException(int limite, Object item) {
    super("A fila está cheia.");
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