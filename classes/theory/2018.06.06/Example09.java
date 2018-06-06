public class Example09 {

  public static boolean isAnagram(String wordA, String wordB) {
    if (wordA.length() != wordB.length()) return false;

    int sumA = asciiSum(wordA);
    int sumB = asciiSum(wordB);

    return sumA == sumB;
  }

  public static int asciiSum(String word) {
    int sum = 0;
    for (int i = 0; i < word.length(); i++)
      sum += (int) word.charAt(i);
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(isAnagram("gelo", "lego"));
    System.out.println(isAnagram("gelo", "exemplo"));
    System.out.println(isAnagram("gelo", "belo"));
  }

}