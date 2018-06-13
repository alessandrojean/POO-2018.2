import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Morse {

  public static String[][] characters = {
    {"a", ".-"}, {"b", "-..."}, {"c", "-.-."}, {"d", "-.."}, {"e", "."},
    {"f", "..-."}, {"g", "--."}, {"h", "...."}, {"i", ".."}, {"j", ".---"},
    {"k", "-.-"}, {"l", ".-.."}, {"m", "--"}, {"n", "-."}, {"o", "---"},
    {"p", ".--."}, {"q", "--.-"}, {"r", ".-."}, {"s", "..."}, {"t", "-"},
    {"u", "..-"}, {"v", "...-"}, {"w", ".--"}, {"x", "-..-"}, {"y", "-.--"},
    {"z", "--.."}, {"1", ".----"}, {"2", "..---"}, {"3", "...--"}, {"4", "....-"},
    {"5", "....."}, {"6", "-...."}, {"7", "--..."}, {"8", "---.."}, {"9", "----."},
    {"0", "-----"}
  };

  public static Map<Character, String> morseCode;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Cria o hashmap com as entradas.
    morseCode = new HashMap<>();
    for (String[] pair : characters) {
      morseCode.put(pair[0].charAt(0), pair[1]);
    }

    int n = scanner.nextInt();
    String word;

    for (int i = 0; i < n; i++) {
      word = scanner.next();
      System.out.println(toMorseCode(word));
    }
  }

  /**
   * Converte a palavra {@code word} em código
   * morse, onde cada letra é separada por
   * um espaço no resultado final.
   * 
   * @param word palavra que será convertida
   * @return a palavra em código morse
   */
  public static String toMorseCode(String word) {
    String result = "", lower = word.toLowerCase();

    for (int i = 0; i < lower.length(); i++) {
      result += morseCode.get(lower.charAt(i)) + (i < lower.length() - 1 ? " " : "");
    }
    return result;
  }

}