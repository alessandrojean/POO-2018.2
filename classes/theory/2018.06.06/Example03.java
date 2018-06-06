import java.lang.Math;

public class Example03 {

  public static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;
    for (int i = 5; i * i <= n; i += 2)
      if (n % i == 0) return false;
    return true;
  }

  public static int countPrimeNumbers(int[] array) {
    int sum = 0;
    for (int element : array) {
      if (isPrime(element))
        sum++;
    }
    return sum;
  }

  public static int countPrimeNumbersVararg(int[] ...array) {
    int sum = 0;
    for (int[] actualArray : array) {
      sum += countPrimeNumbers(actualArray);
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
    int[] array1 = new int[10];
    int[] array2 = new int[5];
    int[] array3 = new int[6];

    randomArray(array1, 1, 100);
    randomArray(array2, 1, 100);
    randomArray(array3, 1, 100);

    printArray(array1);
    printArray(array2);
    printArray(array3);

    int primeCount = countPrimeNumbersVararg(array1, array2, array3);
    System.out.println(primeCount);
  }

}