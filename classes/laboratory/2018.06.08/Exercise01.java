public class Exercise01 {

  /**
   * Calcula o valor de PI utilizando a fórmula
   * de Leibniz com {@code n} termos.
   * 
   * @param n número de termos.
   * @return valor de PI.
   */
  public static double calculatePi(int n) {
    double pi = 0;
    for (int i = 0, imp = 1; i < n; i++, imp += 2) {
      pi += (i % 2 == 1 ? -1 : 1) * 1.0 / imp;
    }
    return pi * 4;
  }

  public static void main(String[] args) {
    System.out.println("PI = " + calculatePi(10000));
  }
  
}