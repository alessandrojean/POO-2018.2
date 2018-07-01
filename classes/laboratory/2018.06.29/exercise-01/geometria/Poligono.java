package geometria;

public class Poligono extends FiguraPlanaConvexa {
  protected double[] lados;
  
  public Poligono(double[] lados) throws Exception {
    super("Polígono");

    for(double lado : lados)
      if (lado < 0)
        throw new Exception("Medida de lado negativa.");

    this.lados = lados.clone();
  }

  @Override
  public double calcularPerimetro() {
    double perimetro = 0;
    for (double lado : lados)
      perimetro += lado;
    return perimetro;
  }
}