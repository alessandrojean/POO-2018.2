import java.lang.Math;

public class Example01 {

  public static int countOddNumbers(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 1)
        sum++;
    }
    return sum;
  }

  public static void randomArray(int[] array, int min, int max) {
    for (int i = 0; i < array.length; i++) {
      array[i] = ((int) Math.round(Math.random() * max)) + min;
    }
  }

  public static void printArray(int[] array) {
    for (int element : array)
      System.out.print(element + " ");
    System.out.print("\n");
  }

  public static void main(String[] args) {
    int[] array = new int[10];
    randomArray(array, 1, 100);
    printArray(array);

    int odd = countOddNumbers(array);
    System.out.println(odd);
  }

}