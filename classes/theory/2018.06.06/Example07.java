public class Example07 {

  public static String wordUpperCase(String input) {
    boolean capitalize = true;
    String finalString = "";
    for (int i = 0; i < input.length(); i++) {
      if (capitalize) {
        finalString += input.substring(i, i + 1).toUpperCase();
        capitalize = false;

        continue;
      }

      capitalize = input.charAt(i) == ' ';
      finalString += input.substring(i, i + 1);
    }

    return finalString;
  }

  public static void main(String[] args) {
    String input = "isso eh um teste";
    String inputWordUpperCase = wordUpperCase(input);

    System.out.println(input);
    System.out.println(inputWordUpperCase);
  }

}