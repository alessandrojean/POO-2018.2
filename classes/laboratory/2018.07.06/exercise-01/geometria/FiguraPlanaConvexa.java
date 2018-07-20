package geometria;

public abstract class FiguraPlanaConvexa {
  protected String tipo;

  public FiguraPlanaConvexa(String tipo) {
    this.tipo = tipo;
  }

  protected void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public abstract double calcularArea();

  public abstract double calcularPerimetro();

  @Override
  public String toString() {
    return tipo + "[área = " + calcularArea() 
      + "; perímetro = " + calcularPerimetro() + "]";
  }
}