import estrutura.*;

public class TesteEstruturas {

	public static void main(String[] args) {
		try (PilhaRecurso pilha = new PilhaRecurso(5)) {
			pilha.empilha("Teste1");
			pilha.empilha("Teste2");
			System.out.println(pilha.desempilha());
		}
	}

}