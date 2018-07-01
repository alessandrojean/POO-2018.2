import futebol.*;

public class Principal {
  public static void main(String[] args) {
    try {
      Jogador jogador1 = new Jogador("Neymar", "123.456.789-10");
      Jogador jogador2 = new Jogador("Philippe Coutinho", new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1});

      Time time = new Time();
      time.adicionaJogador(jogador1);
      time.adicionaJogador(jogador2);
      time.adicionaJogador("Thiago Silva", "123.456.789-12");

      time.imprimeEscalacao();
      time.removerJogador("123.456.789-11");
      time.imprimeEscalacao();
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}