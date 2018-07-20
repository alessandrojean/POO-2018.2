import estrutura.*;

public class TesteEstruturas {

	public static void main(String[] args) {
		try (FilaRecurso fila = new FilaRecurso(5)) {
			fila.enfileira("Teste1");
			fila.enfileira("Teste2");
			System.out.println(fila.desenfileira());
		}
	}

}