package programa;

import java.util.Scanner;
import loteria.*;

public class Loteria {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int qtdSorteios = scanner.nextInt();
    int[] numerosUsuario = new int[3];

    NumeroLoteria[] numerosLoteria = new NumeroLoteria[3];

    for (int i = 0; i < numerosUsuario.length; i++) {
      numerosUsuario[i] = scanner.nextInt();
      numerosLoteria[i] = new NumeroLoteria();
    }

    try {
      NumeroLoteria numero = new NumeroLoteria(numerosUsuario);

      boolean acertou = false;
      for (int i = 0; i < numerosLoteria.length; i++) {
        System.out.println(numerosLoteria[i].getNumeros());
        if (numerosLoteria[i].ganhou(numero))
          acertou = true;
      }

      System.out.println(acertou ? "Acertou pelo menos um dos sorteios."
        : "Não ganhou nenhum sorteio.");
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}