import java.util.Scanner;
import java.lang.Math;

public class Determinantes {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] a = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        a[i][j] = scanner.nextInt();
      }
    }

    System.out.println(determinant(a));
  }

  /**
   * Calcula recursivamente a determinante
   * da matriz quadrada de inteiros {@code a}.
   * 
   * @param a matriz quadrada de inteiros
   * @return determinante da matriz {@code a}
   */
  public static int determinant(int[][] a) {
    if (a.length == 1)
      return a[0][0];

    int result = 0;
    int[][] b = new int[a.length - 1][a.length - 1];
    for (int i = 0; i < a.length; i++) {
      // Copia os valores da matriz a para a menor b.
      for (int j = 0; j < a.length - 1; j++) {
        for (int k = 0, c = 0; k < a.length; k++) {
          if (k == i)
            continue;
          
          b[j][c++] = a[j + 1][k];
        }
      }
      result += Math.pow(-1, i) * a[0][i] * determinant(b);
    }

    return result;
  }

}