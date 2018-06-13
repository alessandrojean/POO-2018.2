import java.util.Scanner;

public class Senha5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String password;

    while (scanner.hasNextLine()) {
      password = scanner.nextLine();

      System.out.println(isPasswordValid(password) 
          ? "Senha valida." : "Senha invalida.");
    }
  }

  /**
   * Verifica se a senha {@code password} é válida
   * nas regras especificadas.
   * 
   * @param password senha que será analisada
   * @return a validação da senha
   */
  public static boolean isPasswordValid(String password) {
    // A senha pode ter de 6 a 32 caracteres.
    if (password.length() < 6 || password.length() > 32)
      return false;

    String cantContain = "áéíóúàèìòùÁÉÍÓÚÀÈÌÒÙâêîôûÂÊÎÔÛãõÃÕ !@#$%&*-+=.";

    boolean haveUpper = false, haveLower = false, haveNumber = false;
    for (char element : password.toCharArray()) {
      if (Character.isUpperCase(element))
        haveUpper = true;
      else if (Character.isLowerCase(element))
        haveLower = true;
      else if (Character.isDigit(element))
        haveNumber = true;

      if (cantContain.contains(Character.toString(element)))
        return false;
    }

    return haveUpper && haveLower && haveNumber;
  }

}