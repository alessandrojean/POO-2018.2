import java.lang.Math;

public class Example04 {

  public static void doubleTheArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] *= 2;
    }
  }

  public static void doubleTheMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++)
      doubleTheArray(matrix[i]);
  }

  public static void randomArray(int[] array, int min, int max) {
    for (int i = 0; i < array.length; i++) {
      array[i] = ((int) Math.round(Math.random() * max)) + min;
    }
  }

  public static void randomMatrix(int[][] matrix, int min, int max) {
    for (int i = 0; i < matrix.length; i++)
      randomArray(matrix[i], min, max);
  }

  public static void printArray(int[] array) {
    for (int element : array)
      System.out.print(element + " ");
    System.out.print("\n");
  }

  public static void printMatrix(int[][] matrix) {
    for (int[] line : matrix)
      printArray(line);
  }

  public static int[][] cloneMatrix(int[][] matrix) {
    int[][] clonedMatrix = new int[matrix.length][];
    for (int i = 0; i < matrix.length; i++) {
      clonedMatrix[i] = matrix[i].clone();
    }
    return clonedMatrix;
  }

  public static void main(String[] args) {
    int[] originalArray = new int[10];
    randomArray(originalArray, 1, 100);

    int[] newArray = originalArray.clone();
    doubleTheArray(originalArray);

    printArray(originalArray);
    printArray(newArray);

    System.out.println();

    int[][] originalMatrix = new int[2][5];
    randomMatrix(originalMatrix, 1, 100);

    int[][] newMatrix = cloneMatrix(originalMatrix);
    doubleTheMatrix(originalMatrix);

    printMatrix(originalMatrix);
    printMatrix(newMatrix);
  }

}