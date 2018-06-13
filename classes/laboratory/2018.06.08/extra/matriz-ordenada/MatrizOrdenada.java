import java.util.Scanner;

public class MatrizOrdenada {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] m = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        m[i][j] = scanner.nextInt();
      }
    }

    selectionSort(m);

    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        System.out.print(m[i][j] + (j < m[i].length - 1 ? " " : "\n"));
      }
    }
  }

  /**
   * Efetua o algoritmo de ordenação Selection Sort
   * nas colunas da matriz quadrada {@code m}.
   * 
   * @param m matriz quadrada desordenada
   */
  public static void selectionSort(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        int lowerIndex = j;
        for (int k = j + 1; k < m.length; k++) {
          if (m[k][i] < m[lowerIndex][i])
            lowerIndex = k;
        }
        int tmp = m[j][i];
        m[j][i] = m[lowerIndex][i];
        m[lowerIndex][i] = tmp;
      }
    }
  }

}