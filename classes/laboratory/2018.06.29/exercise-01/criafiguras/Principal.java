package criafiguras;

import geometria.*;

public class Principal {
  public static void main(String[] args) {
    FiguraPlanaConvexa[] figurasPlanas = new FiguraPlanaConvexa[4];

    try {
      // Cria o círculo.
      figurasPlanas[0] = new Circulo(5);
      // Cria o retângulo.
      figurasPlanas[1] = new Retangulo(10, 20);
      // Cria o quadrado.
      figurasPlanas[2] = new Quadrado(10);
      // Cria o triângulo.
      figurasPlanas[3] = new Triangulo(3, 4, 5);

      // Imprime os valores.
      for (FiguraPlanaConvexa figura : figurasPlanas)
        System.out.println(figura);
    } catch (Exception e) {
      System.out.println(e);
    }
  }  
}