package programa;

import universidade.Pessoa;

public class Principal {

  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();
    pessoa1.setNome("Fulano");
    pessoa1.setCpf("12345678910");

    Pessoa pessoa2 = new Pessoa();
    pessoa2.setNome("Beltrano");
    pessoa2.setCpf("98765432110");

    System.out.println("Pessoa 1: " + pessoa1.getNome());
    System.out.println("Pessoa 2: " + pessoa2.getNome());
  }

}