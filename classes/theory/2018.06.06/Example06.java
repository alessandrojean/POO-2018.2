public class Example06 {

  public static int[] sieveOfErastosthenes(int n) {
    boolean[] allNumbers = new boolean[n + 1];
    for (int i = 2; i * i < n; i++) {
      // Se o número é primo ele possui valor false.
      // Se verdadeiro, deve-se eliminar todos os seus
      // múltiplos restantes na lista.
      if (!allNumbers[i]) {
        // Remover todos os múltiplos de i.
        for (int j = i * 2; j <= n; j += i) {
          // Números não primos tem valor true.
          allNumbers[j] = true;
        }
      }
    }

    // Contar quantos primos o existem na lista.
    int primeCount = 0;
    for (int i = 2; i <= n; i++) {
      // Se é primo, incrementa o contador.
      if (!allNumbers[i])
        primeCount++;
    }

    // Cria o vetor resultante com os números primos.
    int[] primeList = new int[primeCount];
    // O índice index é responsável pelas posições
    // onde os primos serão armazenados no vetor final.
    for (int i = 2, index = 0; i <= n; i++) {
      // Se é primo, então salve o número
      // no vetor final e incremente a posição.
      if (!allNumbers[i])
        primeList[index++] = i;
    }

    return primeList;
  }

  public static void printArray(int[] array, int maxPerLine) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ((i + 1) % maxPerLine == 0 ? "\n" : " "));
    }
  }

  public static void main(String[] args) {
    int n = 120;
    int[] primesArray = sieveOfErastosthenes(n);
    printArray(primesArray, 10);
  }

}