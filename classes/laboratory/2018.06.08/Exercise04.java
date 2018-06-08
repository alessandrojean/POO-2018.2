public class Exercise04 {

  /**
   * Devolve um vetor de inteiros com todos os 
   * números primos no intervalo de 2 até {@code n}. 
   * O método utiliza um algoritmo baseado no
   * Crivo de Eratóstenes.
   * 
   * @param n intervalo máximo.
   * @return vetor de inteiros com os números 
   *         primos entre 2 e n.
   */
  public static int[] sieveOfEratosthenes(int n) {
    boolean[] prime = new boolean[n + 1];
    for (int i = 2; i * i <= n; i++) {
      if (!prime[i]) {
        for (int j = i * 2; j <= n; j += i) {
          prime[j] = true;
        }
      }
    }

    int count = 0;
    for (int i = 2; i <= n; i++) {
      if (!prime[i])
        count++;
    }

    int[] numbers = new int[count];
    for (int i = 2, pos = 0; i <= n; i++) {
      if (!prime[i]) {
        numbers[pos++] = i;
      }
    }

    return numbers;
  }

  /**
   * Imprime os elementos do vetor de inteiros 
   * {@code array} separados por um espaço simples,
   * onde cada linha possui no máximo {@code perLine}
   * elementos.
   * 
   * @param array vetor a ser impresso.
   * @param perLine número máximo de elementos por linha.
   */
  public static void printArray(int[] array, int perLine) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ((i + 1) % perLine == 0 ? "\n" : " "));
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int n = 120;
    int[] primes = sieveOfEratosthenes(n);
    printArray(primes, 10);
  }
  
}