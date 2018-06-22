package autocorrecao;

import java.util.Random;

public class Pergunta {
  private String textoPergunta;
  private Alternativa[] alternativas;
  private int alternativaCorreta;
  private int indiceAtual;

  public Pergunta(int qtdAlternativas, String textoPergunta) {
    alternativas = new Alternativa[qtdAlternativas];
    alternativaCorreta = -1;
    indiceAtual = -1;
    this.textoPergunta = textoPergunta;
  }

  public void adicionarAlternativa(boolean correta, String alternativa) throws Exception {
    adicionarAlternativa(correta, new Alternativa(alternativa));
  }

  public void adicionarAlternativa(boolean correta, Alternativa alternativa) throws Exception {
    if (indiceAtual+1 >= alternativas.length) {
      throw new Exception("Limite de alternativas atingido!");
    }
    indiceAtual++;
    alternativas[indiceAtual] = alternativa;
    if (correta) {
      if (indiceAtual > 0) {
        throw new Exception("Há outra alternativa correta!");
      } else {
        alternativaCorreta = indiceAtual;
      }
    }
  }

  public void imprimirPergunta() {
    imprimirPergunta(1);
  }

  public void imprimirPergunta(int modo) {
    System.out.println("Enunciado: " + this.textoPergunta);

    Alternativa[] alternativasTmp = alternativas.clone();

    if (modo == 2) {
      Random random = new Random();
      for (int i = 0; i < alternativasTmp.length; i++) {
        int r = random.nextInt(alternativasTmp.length);
        Alternativa tmp = alternativasTmp[r];
        alternativasTmp[r] = alternativasTmp[i];
        alternativasTmp[i] = tmp;
      }
    }

    for (Alternativa alternativa : alternativasTmp) {
      System.out.println("  - " + alternativa.descricao);
    }
    System.out.print("\n");
  }
    
}