package palavra;

public class ObserverContaPar implements Observer {
  private int total;

  @Override
  public void update(String palavra) {
    if (palavra.length() % 2 == 0)
      total++;
  }

  @Override
  public int palavrasContadas() {
    return total;
  }
  
}