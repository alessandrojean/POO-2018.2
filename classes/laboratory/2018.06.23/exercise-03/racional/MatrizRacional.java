package racional;

import racional.NumeroRacional;

public class MatrizRacional {
  private static int quantidade = 3;
  NumeroRacional[][] matriz;

  public MatrizRacional() {
    matriz = new NumeroRacional[quantidade][quantidade];
    quantidade++;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = new NumeroRacional();
      }
    }
  }

  public MatrizRacional(int n, int m) {
    matriz = new NumeroRacional[n][m];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = new NumeroRacional(0, 1);
      }
    }
  }

  public void soma(MatrizRacional outra) throws Exception {
    if (matriz.length != outra.matriz.length 
        || matriz[0].length != outra.matriz.length) {
      throw new Exception("Matriz de tamanho inválido para soma.");
    }

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j].soma(outra.matriz[i][j]);
      }
    }
  }

  public void imprimir() {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j].getString() + " ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }
  
}