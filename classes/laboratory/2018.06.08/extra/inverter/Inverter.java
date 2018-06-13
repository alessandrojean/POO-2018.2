import java.util.Scanner;

public class Inverter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    int[] v = new int[n];
    for (int i = 0; i < v.length; i++) {
      v[n - i - 1] = scanner.nextInt();
    }

    for (int i = 0; i < v.length; i++) {
      System.out.print(v[i] + (i < n - 1 ? " " : "\n"));
    }
  }

}