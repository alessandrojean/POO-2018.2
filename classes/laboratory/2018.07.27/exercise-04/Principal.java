import palavra.*;

public class Principal {

  public static void main(String[] args) {
    String frase = "Omae wa mou shindeiru";

    NotificaPalavra processador = new NotificaPalavra(3);
    processador.attach(new ObserverContaPar());
    processador.attach(new ObserverContaMaiuscula());
    processador.attach(new ObserverContaPalavra());

    processador.processarFrase(frase);

    for (Observer o : processador.getObservers()) {
      System.out.println(o.getClass().getSimpleName() + ": " + o.palavrasContadas());
    }
  }
  
}