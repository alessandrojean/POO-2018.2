import java.util.Arrays;

public class Exercise05 {

  /**
   * Efetua a ordenação por seleção no vetor
   * de inteiros {@code array}.
   * 
   * @param array vetor de inteiros desordenado.
   */
  public static void selectionSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int lowerIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[lowerIndex]) {
          lowerIndex = j;
        }
      }

      int tmp = array[i];
      array[i] = array[lowerIndex];
      array[lowerIndex] = tmp;
    }
  }

  public static void main(String[] args) {
    int[] array = {20, 8, 6, 7, 8, 10, 22, 12, 18, 15};
    System.out.println(Arrays.toString(array));

    selectionSort(array);
    System.out.println(Arrays.toString(array));
  }

}