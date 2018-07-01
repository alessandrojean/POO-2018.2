package futebol;

public class Jogador {
  private String nome;
  private String NI = "";

  public Jogador(String nome, String NI) throws Exception {
    verificaNI(NI);
    this.nome = nome;
    this.NI = NI;
  }

  public Jogador(String nome, int[] NI) throws Exception {
    verificaNI(NI);
    this.nome = nome;

    for (int i = 0; i < NI.length; i++) {
      this.NI += NI[i] + "";
      if (i == 2 || i == 5)
        this.NI += ".";
      if (i == 8)
        this.NI += "-";
    }
  }

  private static void verificaNI(String NI) throws Exception {
    if (NI.length() != 14)
      throw new Exception("NI é inválido.");

    if (!NI.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}"))
      throw new Exception("NI é inválido.");
  }

  private static void verificaNI(int[] NI) throws Exception {
    if (NI.length != 11)
      throw new Exception("NI é inválido.");

    for (int i = 0; i < NI.length; i++) {
      if (NI[i] < 0 || NI[i] > 9)
        throw new Exception("NI é inválido."); 
    }
  }
  
  public String getNI() {
    return NI;
  }

  public String getNome() {
    return nome;
  }
}