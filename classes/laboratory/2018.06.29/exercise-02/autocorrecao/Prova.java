package autocorrecao;

public class Prova {

	Pergunta[] perguntasDaProva = new Pergunta[5];
	
	public void adicionaPergunta(Pergunta novaPergunta) {
		boolean adicionouPergunta = false;
		for (int i = 0; i < perguntasDaProva.length && !adicionouPergunta; i++)
			if (perguntasDaProva[i] == null) {
				perguntasDaProva[i] = novaPergunta;
				adicionouPergunta = true;
			}
		
		if (!adicionouPergunta)
			System.out.println("Nao adicionou pergunta!");
	}
	
	public void imprimirProva() {
		System.out.println("--- PROVA ---");
		for (Pergunta elemento : perguntasDaProva)
			if (elemento != null)
				elemento.imprimirPergunta();
	}
}