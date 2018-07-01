import racional.MatrizRacional;

public class Principal {
  public static void main(String[] args) {
    MatrizRacional matrizA = new MatrizRacional();
    MatrizRacional matrizB = new MatrizRacional(3, 3);

    matrizA.imprimir();
    matrizB.imprimir();

    try {
      matrizA.soma(matrizB);
      matrizA.imprimir();
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}