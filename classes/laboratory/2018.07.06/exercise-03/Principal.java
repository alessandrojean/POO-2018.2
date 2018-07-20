import aulas.*;

public class Principal {

	public static void main(String[] args) {
		try {
			PlanoDeAulas plano = new PlanoDeAulas("POO", 10);
			Aula a1 = new Teorica("Introducao");
			Aula a2 = new Pratica("Classes");
			Aula a3 = new Teorica("Construtor");
			Aula a4 = new Teorica("Polimorfismo");
			plano.adicionarAula(a1);
			plano.adicionarAula(new Prova());
			plano.adicionarAula(a2);
			plano.adicionarAula(a3);
			plano.adicionarAula(a4);
			
			Avaliacao a5 = new Projeto();
			plano.adicionarAula(a5);
			plano.adicionarProvaSurpresa();
			plano.imprimirPlano();	
			System.out.println("Formula atual = " + plano.getFormulaAvaliacao());
			
			plano.cancelarProvas();			
			System.out.println();
			plano.imprimirPlano();	
			System.out.println("Formula depois de cancelar provas = " + plano.getFormulaAvaliacao());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}