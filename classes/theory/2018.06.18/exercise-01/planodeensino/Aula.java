package planodeensino;

public class Aula {
  private String nome;

  public Aula(String nome) {
    setNome(nome);
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }
}