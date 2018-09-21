package palavra;

public class ObserverContaMaiuscula implements Observer {
  private int total;

  @Override
  public void update(String palavra) {
    if (Character.isUpperCase(palavra.charAt(0)))
      total++;
  }

  @Override
  public int palavrasContadas() {
    return total;
  }
  
}