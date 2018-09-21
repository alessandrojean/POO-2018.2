import universidade.*;
import autenticacao.*;
import java.util.Scanner;

public class SistemaNotas {

	private static IMetodoAutenticacao autenticacao;
	
	private static void inicializaAutenticacao(String tipo) throws Exception {
		if (tipo.equals("senha"))
			autenticacao = new AutenticacaoPorSenha();
		else if (tipo.equals("swipe"))
			autenticacao = new AutenticacaoPorSwipe();
		else throw new Exception("Tipo de autenticacao invalido!");
	}

	public static void main(String[] args) throws Exception {
	
		inicializaAutenticacao(args[0]);
	
		ListaNotas lista = new ListaNotas(10);
		lista.adicionarItemNota(new ItemNota(123, "POO", 10.0));
		lista.adicionarItemNota(new ItemNota(555, "PI", 8.0));
		lista.adicionarItemNota(new ItemNota(555, "POO", 10.0));
		lista.adicionarItemNota(new ItemNota(123, "PE", 5.0));
		lista.adicionarItemNota(new ItemNota(123, "PI", 2.0));
	
		Scanner leitor = new Scanner(System.in);
	
		boolean continua = true;
		while (continua) {
			lista.imprimirNotasAula(autenticacao); // Passa método de autenticação instanciado
			
			System.out.println("Continuar? S/N");
			String entradaUsuario = leitor.next();
			continua = (entradaUsuario.charAt(0) == 'S');
		}
	}

}