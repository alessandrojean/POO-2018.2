import java.util.Arrays;

public class Exercise02 {

  /**
   * Insere o elemento {@code number} na posição
   * {@code position}, caso possível, no vetor
   * de inteiros {@code array}, deslocando os
   * elementos posteriores a {@code position}.
   * Os elementos com valor de {@code 0} no 
   * vetor {@code array} são tratados como 
   * espaços em branco e serão utilizados,
   * caso possível, para os deslocamentos.
   * 
   * @param array vetor a ser modificado.
   * @param number elemento a ser inserido, caso possível.
   * @param position posição onde {@code number} será inserido.
   * @return {@code true} se houve sucesso.
   */
  public static boolean insertInArray(int[] array, int number, int position) {
    // Se a posição é inválida, ou se a 
    // posição é maior que o tamanho do vetor.
    if (position < 0 || array.length < position + 1) return false;

    // Se a posição já é 0.
    if (array[position] == 0) {
      array[position] = number;
      return true;
    }

    int positionZero = containsZero(array, position);

    // Se está cheio.
    if (positionZero == -1) return false;

    // Se precisa deslocar.
    for (int i = positionZero; i > position; i--) {
      array[i] = array[i - 1];
    }
    array[position] = number;

    return true;
  }

  /**
   * Verifica se no vetor {@code array} a partir da
   * posição {@code position} (caso exista) existe
   * algum espaço em branco para inserção de elementos.
   * 
   * Caso haja algum espaço a partir de {@code position},
   * retorna a posição deste, senão retorna {@code -1}.
   * 
   * @param array vetor a ser analisado.
   * @param position posição inicial para analisar.
   * @return posição do espaço em branco (caso exista).
   */
  public static int containsZero(int[] array, int position) {
    for (int i = position; i < array.length; i++) {
      if (array[i] == 0) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] array = {25, 14, 56, 15, 36, 0, 77, 18, 29, 49};
    int n = 10, p = 3;

    System.out.println(Arrays.toString(array));

    boolean ret = insertInArray(array, n, p);
    System.out.println("ret = " + ret);

    System.out.println(Arrays.toString(array));
  }
  
}