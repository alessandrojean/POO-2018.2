import aulas.*;
import log.*;

public class Principal {

	public static void main(String[] args) {
		
		try (LogABC log = LogABC.getInstancia()) {
			log.registrarAcao("Inicio do programa");
			
			PlanoDeAulas plano = new PlanoDeAulas("Fisica", 10);
			Aula a1 = new Teorica("Introducao");
			Aula a2 = new Pratica("Classes");
			Aula a3 = new Teorica("Construtor");
			Aula a4 = new Teorica("Polimorfismo");
			log.registrarAcao("Aulas basicas foram criadas");
			
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
			log.registrarAcao("Fim do programa");
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
	}

}