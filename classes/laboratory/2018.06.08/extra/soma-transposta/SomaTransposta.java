import java.util.Scanner;

public class SomaTransposta {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] a = new int[n][n];

    // Leitura da matriz A de n x n elementos.
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = scanner.nextInt();
      }
    }

    int[][] b = sumWithTranspose(a);
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b[i].length; j++) {
        System.out.print(b[i][j] + (j < b[i].length - 1 ? " " : "\n"));
      }
    }

  }
  public static int[][] sumWithTranspose(int[][] A) {
    int[][] B = new int[A.length][A.length];
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        B[i][j] = A[i][j] + A[j][i]; 
      }
    }
    return B;
  }

}