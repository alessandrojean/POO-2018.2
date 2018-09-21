package autenticacao;

import java.util.Scanner;

public class AutenticacaoPorSwipe implements IMetodoAutenticacao {

  public UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o codigo:");
    int codigo = scanner.nextInt();

    System.out.println("Digite o nome:");
    String nome = scanner.next();

    imprimirSwipe();
    System.out.println("Digite a sequencia de swipe (xy):");
    String swipe = scanner.next();

    if (!swipe.equals("112233"))
      throw new UsuarioNaoAutenticadoException();

    return new UsuarioAutenticado(codigo, nome);
  }

  private void imprimirSwipe() {
    System.out.println("   1   2   3");
    System.out.println("1  o   o   o");
    System.out.println("2  o   o   o");
    System.out.println("3  o   o   o\n");
  }
  
}