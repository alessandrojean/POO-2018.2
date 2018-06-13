import java.util.Scanner;

public class Chocolate2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(), m = scanner.nextInt();
    int[][] a = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] = scanner.nextInt();
      }
    }

    int day = scanner.nextInt(), month = scanner.nextInt();
    System.out.println(countSegments(a, month, day));
  }

  /**
   * Conta quantos segmentos possíveis de {@code digits} digitos
   * onde a soma de cada dígito é igual a {@code total}.
   * 
   * @param a matriz de entrada
   * @param digits quantidade de dígitos em cada segmento
   * @param total soma que cada segmento deve ter
   */
  public static int countSegments(int[][] a, int digits, int total) {
    int count = 0;

    // Verifica os segmentos formados apenas por linhas.
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        int sum = 0, k = 0;
        for (k = 0; k < digits && j + k < a[i].length; k++) {
          sum += a[i][j + k];
        }
        if (sum == total && k == digits)
          count++;
      }
    }

    // Verifica os segmentos formados apenas por colunas.
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        int sum = 0, k = 0;
        for (k = 0; k < digits && k + i < a.length; k++) {
          sum += a[i + k][j];
        }
        if (sum == total && k == digits)
          count++;
      }
    }

    return count;
  }

}