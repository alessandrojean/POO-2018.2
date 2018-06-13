package copadomundo;

public class Estadio {
  private int capacidade = 0;
  private String nome;
  private String localizacao;

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public int getCapacidade() {
    return this.capacidade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
  }

  public String getLocalizacao() {
    return this.localizacao;
  }
}