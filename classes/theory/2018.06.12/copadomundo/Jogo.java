package copadomundo;

public class Jogo {
  private String paisA;
  private String paisB;
  private int pontosA;
  private int pontosB;
  private Estadio estadio;
  private String data;

  public void setPaisA(String paisA) {
    this.paisA = paisA;
  }

  public String getPaisA() {
    return paisA;
  }

  public void setPaisB(String paisB) {
    this.paisB = paisB;
  }

  public String getPaisB() {
    return paisB;
  }

  public void setPontosA(int pontosA) {
    this.pontosA = pontosA;
  }

  public int getPontosA() {
    return pontosA;
  }

  public void setPontosB(int pontosB) {
    this.pontosB = pontosB;
  }

  public int getPontosB() {
    return pontosB;
  }

  public void setEstadio(Estadio estadio) {
    this.estadio = estadio;
  }

  public Estadio getEstadio() {
    return estadio;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getData() {
    return data;
  }
}