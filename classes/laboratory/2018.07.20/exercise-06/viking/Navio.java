package viking;

import estrutura.*;

/**
 * Navio
 */
public class Navio {
  private PilhaAprimorada vikings;
  private int tamanhoMax = 20;

  public Navio() {
    vikings = new PilhaAprimorada(tamanhoMax);
  }

  public void embarcar(Viking viking) {
    vikings.empilha(viking);
    System.out.println(viking);
  }

  public Viking desembarcar() {
    Viking viking = (Viking) vikings.desempilha();
    System.out.println(viking);

    return viking;
  }

  public int getTamanhoMax() {
    return tamanhoMax;
  }
}