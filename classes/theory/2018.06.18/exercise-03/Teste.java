import autocorrecao.*;

public class Teste {
  public static void main(String[] args) {
    Prova p1 = new Prova(2, "Prova Final");

    try {
      Pergunta q1 = new Pergunta(3, "Quanto eh 1 + 1?");
      q1.adicionarAlternativa(true, "2");
      q1.adicionarAlternativa(false, "3");
      q1.adicionarAlternativa(false, "18");
      p1.adicionarPergunta(q1);

      Pergunta q2 = new Pergunta(2, "Qual o valor de PI?");
      q2.adicionarAlternativa(true, "3.14");
      q2.adicionarAlternativa(false, "80");
      p1.adicionarPergunta(q2);
    } catch (Exception e) {
      System.out.println("Deu erro :-(\n[" + e.toString() + "]");
    }

    p1.imprimirProva();
  }
}