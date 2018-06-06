import java.lang.Math;

public class Example05 {

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

  public static void recursiveSelectionSort(int[] array, int index) {
    if (index == array.length - 1) return;
    
    int lowerIndex = index;
    for (int i = index + 1; i < array.length; i++) {
      if (array[i] < array[lowerIndex])
        lowerIndex = i;
    }
    
    int tmp = array[index];
    array[index] = array[lowerIndex];
    array[lowerIndex] = tmp;
    
    recursiveSelectionSort(array, index + 1);
}

  public static void main(String[] args) {
    int[] array = new int[10];
    randomArray(array, 1, 100);
    printArray(array);

    // iterativeSelectionSort(array);
    recursiveSelectionSort(array, 0);

    printArray(array);
  }

}