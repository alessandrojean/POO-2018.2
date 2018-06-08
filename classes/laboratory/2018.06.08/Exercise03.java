public class Exercise03 {

  /**
   * Converte o número decimal {@code n} para
   * a base binária, em formato de {@code String}.
   * 
   * Algoritmo recursivo.
   * 
   * @param n número em decimal.
   * @return representação em binário de {@code n}.
   */
  public static String decimalToBinary(int n) {
    if (n / 2 == 0)
      return String.valueOf(n % 2);

    return decimalToBinary(n / 2) + n % 2;
  }

  public static void main(String[] args) {
    int n = 25;
    System.out.println(decimalToBinary(n));
    System.out.println(Integer.toBinaryString(n));
  }
  
}