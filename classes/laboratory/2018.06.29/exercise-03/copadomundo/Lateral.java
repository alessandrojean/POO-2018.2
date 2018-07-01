package copadomundo;

public class Lateral extends Jogador {
  private String ladoCampo;

  public Lateral(int numeroCamisa, String nome, String ladoCampo) {
    super(numeroCamisa, "Lateral", nome);
    this.ladoCampo = ladoCampo;
  }

  public String getLadoCampo() {
    return ladoCampo;
  }

  @Override
  public String toString() {
    return super.toString() + " (" + ladoCampo + ")";
  }
}