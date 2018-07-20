import viking.*;

public class TesteVikings {
  public static void main(String[] args) {
    Navio navio = new Navio();

    System.out.println("Vikings embarcando:");
    navio.embarcar(new Timoneiro());

    for (int i = 0; i < 18; i++) {
      navio.embarcar(new Remador());
    }

    navio.embarcar(new Lider());

    System.out.println("\nVikings desembarcando:");
    for (int i = 0; i < navio.getTamanhoMax(); i++) {
      navio.desembarcar();
    }
  }
}