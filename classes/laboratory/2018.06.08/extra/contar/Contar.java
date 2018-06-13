import java.util.Scanner;

public class Contar {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    int[] v = new int[n];
    for (int i = 0; i < n; i++) {
      v[i] = scanner.nextInt();
    }

    int x = scanner.nextInt();

    System.out.println(countElementsGreaterThanX(v, 0, x));
  }

  /**
   * Conta quantos elementos tem valor maior ou igual
   * ao inteiro {@code x} no vetor de inteiros {@code v}.
   * 
   * @param v vetor de inteiros
   * @param i indice atual
   * @param x número base
   * @return quantidade de elementos maiores ou iguais a {@code x}
   */
  public static int countElementsGreaterThanX(int[] v, int i, int x) {
    if (i >= v.length)
      return 0;

    return (v[i] >= x ? 1 : 0) + countElementsGreaterThanX(v, i + 1, x);
  }

}