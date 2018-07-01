package geometria;

public class FiguraPlanaConvexa {
  protected String tipo;

  public FiguraPlanaConvexa(String tipo) {
    this.tipo = tipo;
  }

  protected void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double calcularArea() {
    return 0.0;
  }

  public double calcularPerimetro() {
    return 0.0;
  }

  @Override
  public String toString() {
    return tipo + "[área = " + calcularArea() 
      + "; perímetro = " + calcularPerimetro() + "]";
  }
}