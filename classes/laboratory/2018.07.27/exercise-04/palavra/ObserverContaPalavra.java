package palavra;

public class ObserverContaPalavra implements Observer {
  private int total;

  @Override
  public void update(String palavra) {
    total++;
  }

  @Override
  public int palavrasContadas() {
    return total;
  }
  
}