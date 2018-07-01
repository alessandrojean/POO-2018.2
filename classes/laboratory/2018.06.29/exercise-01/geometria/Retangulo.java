package geometria;

public class Retangulo extends Poligono {

  public Retangulo(double ladoA, double ladoB) throws Exception {
    super(new double[]{ladoA, ladoB});
    setTipo("Retângulo");
  }

  @Override
  public double calcularArea() {
    return lados[0] * lados[1];
  }
}