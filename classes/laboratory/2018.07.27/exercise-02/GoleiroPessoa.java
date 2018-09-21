import java.util.Scanner;

public class GoleiroPessoa extends Jogador implements GoleiroStrategy {

	public GoleiroPessoa(String nome) {
		super(nome);
	}

	@Override
	public int defender() {
		System.out.println("Qual lado voce vai defender? 1=esquerda 2=meio 3=direita");
		Scanner leitor = new Scanner(System.in);
		return leitor.nextInt();		
	}

}