import java.util.Scanner;

public class Consoantes {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char letter = ' ';
    int consonantCounter = 0;

    while ((letter = scanner.next().charAt(0)) != '*') {
      if (isConsonant(letter))
        consonantCounter++;
    }

    System.out.println(consonantCounter);
  }

  /**
   * Verifica se o caractere {@code letter} é uma
   * consoante, sem diferenciação de caso.
   * 
   * @param letter letra que será verificada
   * @return {@code true} se a letra é uma consoante
   */
  public static boolean isConsonant(char letter) {
    return letter != 'a' && letter != 'A' && letter != 'e' && letter != 'E'
      && letter != 'i' && letter != 'I' && letter != 'o' && letter != 'O'
      && letter != 'u' && letter != 'U';
  }

}