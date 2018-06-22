package planodeensino;

public class PlanoDeEnsino {
  private Aula[] aulas;
  private String nomeDisciplina;
  private int proximoIndice = 0;

  public PlanoDeEnsino() {
    this(10, null);
  }

  public PlanoDeEnsino(int numeroDeAulas) {
    this(numeroDeAulas, null);
  }

  public PlanoDeEnsino(int numeroDeAulas, String nomeDisciplina) {
    this.aulas = new Aula[numeroDeAulas];
    this.nomeDisciplina = nomeDisciplina;
  }

  public void setNomeDisciplina(String nomeDisciplina) {
    this.nomeDisciplina = nomeDisciplina;
  }

  public String getNomeDisciplina() {
    return nomeDisciplina;
  }

  public void adicionarAula(String nomeAula) {
    adicionarAula(new Aula(nomeAula));
  }

  public void adicionarAula(Aula aula) {
    this.aulas[proximoIndice++] = aula;
  }
}