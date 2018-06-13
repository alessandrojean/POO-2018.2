import java.util.Scanner;

public class Soremun {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.printf("%04d\n", invert(n));
  }

  /**
   * Inverte um inteiro {@code n}
   * entre 1000 e 9999.
   * 
   * @param n numero inteiro
   * @return numero {@code n} ao contrário
   */
  public static int invert(int n) {
    int inverted = 0;

    while (n > 0) {
      int lastDigit = n % 10;
      inverted = inverted * 10 + lastDigit;
      n /= 10;
    }

    return inverted;
  }

}