package geometria;

public class Circulo extends FiguraPlanaConvexa {
  private double raio;
  
  public Circulo(double raio) throws Exception {
    super("Círculo");

    if (raio < 0)
      throw new Exception("Raio negativo.");

    this.raio = raio;
  }

  @Override
  public double calcularArea() {
    return Math.PI * raio * raio;
  }

  @Override
  public double calcularPerimetro() {
    return 2 * Math.PI * raio;
  }
}