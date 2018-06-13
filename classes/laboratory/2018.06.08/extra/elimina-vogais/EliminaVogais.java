import java.util.Scanner;

public class EliminaVogais {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String word;

    while(scanner.hasNextLine()) {
      word = scanner.nextLine();

      String withoutVowels = removeVowels(word);
      int vowelCount = word.length() - withoutVowels.length();
      System.out.println(vowelCount + " " + withoutVowels);
    }
  }

  /**
   * Remove as vogais da palavra {@code word}.
   * 
   * @param word palavra
   * @return palavra sem vogais
   */
  public static String removeVowels(String word) {
    String result = "", lowerCase = word.toLowerCase();
    for (int i = 0; i < word.length(); i++) {
      if (!isVowel(lowerCase.charAt(i)))
        result += word.charAt(i);
    }
    return result;
  }

  /**
   * Retorna se uma dada letra {@code letter} é
   * uma vogal ou não.
   * 
   * @param letter letra a ser analisada
   * @return {@code true} se a {@code letter} é uma vogal
   */
  public static boolean isVowel(char letter) {
    return letter == 'a' || letter == 'e' || letter == 'i'
      || letter == 'o' || letter == 'u'; 
  }

}