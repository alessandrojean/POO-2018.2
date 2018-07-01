import copadomundo.*;

public class Principal {
  public static void main(String[] args) {
    try {
      Time selecaoBrasileira = new Time("Brasil");

      Jogador meninoNeymar = new Atacante(10, "Neymar Jr");
      Jogador meninoCoutinho = new Atacante(11, "Philippe Coutinho");
      Jogador meninoAlisson = new Goleiro(1, "Alisson");

      selecaoBrasileira.adicionarJogador(meninoNeymar);
      selecaoBrasileira.adicionarJogador(meninoCoutinho);
      selecaoBrasileira.adicionarJogador(meninoAlisson);

      Time selecaoJaponesa = new Time("Japão");

      Jogador shinjiShounen = new Atacante(10, "Shinji Kagawa");
      Jogador takashiShounen = new Atacante(11, "Takashi Usami");
      Jogador eijiShounen = new Goleiro(1, "Eiji Kawashima");

      selecaoJaponesa.adicionarJogador(shinjiShounen);
      selecaoJaponesa.adicionarJogador(takashiShounen);
      selecaoJaponesa.adicionarJogador(eijiShounen);

      selecaoBrasileira.imprimirEscalacao();
      selecaoJaponesa.imprimirEscalacao();

      Jogador substituicao = new Goleiro(16, "Cássio");
      selecaoBrasileira.substituirJogador(1, substituicao);

      System.out.println("Após substituição:");
      selecaoBrasileira.imprimirEscalacao();
    } catch (Exception e) {
      System.out.println(e);
      e.printStackTrace();
    }
  }  
}