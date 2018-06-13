import java.util.Scanner;

public class ProdEsc {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] A = readArray(scanner, n);
    int[] B = readArray(scanner, n);
    System.out.println(dotProduct(A, B));
  }

  /**
   * Lê um vetor de {@code n} elementos inteiros.
   * 
   * @param scanner leitor
   * @param n número de elementos
   * @return vetor com {@code n} elementos inteiros
   */
  public static int[] readArray(Scanner scanner, int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }
    return array;
  }

  /**
   * Efetua o produto escalar entre os
   * vetores {@code a} e {@code b}.
   * 
   * @param a vetor a
   * @param b vetor b
   * @return produto escalar de a e b
   */
  public static int dotProduct(int[] a, int[] b) {
    int result = 0;
    for (int i = 0; i < a.length; i++) {
      result += a[i] * b[i];
    }
    return result;
  }

}