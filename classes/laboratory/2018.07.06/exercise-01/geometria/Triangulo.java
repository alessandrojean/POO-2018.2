package geometria;


public class Triangulo extends Poligono {
  private double ladoA;
  private double ladoB;
  private double ladoC;

  public Triangulo(double ladoA, double ladoB, double ladoC) throws Exception {
    super(new double[]{ladoA, ladoB, ladoC});
    setTipo("Triângulo");
  }

  public double calcularArea() {
    double s = calcularPerimetro() / 2.0;
    return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
  }
  
}
