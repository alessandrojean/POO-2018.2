import java.util.Scanner;

public class Potencia {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt(), n = scanner.nextInt();

    System.out.println(powerOf(a, n));
  }

  /**
   * Efetua a operação {@code a} ^ {@code n},
   * através de um algoritmo recursivo.
   * 
   * @param a base
   * @param n expoente
   * @return o resultado de {@code a} ^ {@code n}
   */
  public static long powerOf(int a, int n) {
    if (n == 0)
      return 1;
    
    return a * powerOf(a, n - 1);
  }

}