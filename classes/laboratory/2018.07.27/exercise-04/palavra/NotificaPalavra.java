package palavra;

public class NotificaPalavra {

  private Observer[] observers;
  private int numObservers;

  public NotificaPalavra(int numObservers) {
    this.numObservers = numObservers;
    this.observers = new Observer[numObservers];
  }

  public void processarFrase(String frase) {
    String[] fraseDividida = frase.split(" ");
    for (String palavra : fraseDividida) {
      for (Observer o : observers) {
        o.update(palavra);
      }
    }
  }

  public void attach(Observer o) {
    for (int i = 0; i < numObservers; i++) {
      if (observers[i] == null) {
        observers[i] = o;
        break;
      }
    }
  }

  public Observer[] getObservers() {
    return observers;
  }

}