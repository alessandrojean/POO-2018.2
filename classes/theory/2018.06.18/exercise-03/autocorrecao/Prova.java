package autocorrecao;

public class Prova {
  private Pergunta[] perguntas;
  private int indiceAtual;
  private String titulo;

  public Prova(int qtdPerguntas) {
    perguntas = new Pergunta[qtdPerguntas];
    indiceAtual = -1;
    titulo = "Prova";
  }

  public Prova(int qtdPerguntas, String titulo) {
    perguntas = new Pergunta[qtdPerguntas];
    indiceAtual = -1;
    this.titulo = titulo;
  }    

  public void adicionarPergunta(Pergunta novaPergunta) throws Exception {
    if (indiceAtual + 1 >= perguntas.length) {
      throw new Exception("Limite de perguntas atingido!");
    }
    perguntas[++indiceAtual] = novaPergunta;
  }

  public void imprimirProva() {
    System.out.println("--- " + this.titulo + " ---");
    for (Pergunta pergunta : perguntas) {
      pergunta.imprimirPergunta();
    }
  }
}