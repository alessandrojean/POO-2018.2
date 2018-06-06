import java.lang.Math;

public class Example08 {

  public static void randomArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = ((int) Math.round(Math.random() * 20)) + 1;
    }
  }

  public static void printArray(int[] array) {
    for (int element : array)
      System.out.print(element + " ");
    System.out.print("\n");
  }

  public static void iterativeSelectionSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      int lowerIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[lowerIndex])
          lowerIndex = j;
      }

      int tmp = array[i];
      array[i] = array[lowerIndex];
      array[lowerIndex] = tmp;
    }
  }

  public static double average(int[] array) {
    int sum = 0;
    for (int element : array)
      sum += element;

    return sum / (double) array.length;
  }

  public static double median(int[] array) {
    int[] arrayClone = array.clone();
    iterativeSelectionSort(arrayClone);

    int n = arrayClone.length;

    if (array.length % 2 == 0)
      return (arrayClone[n / 2] + arrayClone[n / 2 - 1]) / 2.0;

    return (double) arrayClone[n / 2];
  }

  public static void main(String[] args) {
    int[] array = new int[10];
    randomArray(array);
    printArray(array);

    double average = average(array);
    System.out.println("M\u00E9dia: " + average);

    double median = median(array);
    System.out.println("Mediana: " + median);
  }

}