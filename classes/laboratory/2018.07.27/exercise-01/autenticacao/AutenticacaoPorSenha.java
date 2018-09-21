package autenticacao;

import java.util.Scanner;

public class AutenticacaoPorSenha implements IMetodoAutenticacao {

  public UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException {
    Scanner scanner = new Scanner(System.in);
   
    System.out.println("Digite o codigo:");
    int codigo = scanner.nextInt();

    System.out.println("Digite o nome:");
    String nome = scanner.next();

    System.out.println("Digite a SENHA:");
    String senha = scanner.next();

    if (!senha.equals("1234"))
      throw new UsuarioNaoAutenticadoException();

    return new UsuarioAutenticado(codigo, nome);
  }
  
}