package autocorrecao;

public class MultiplaEscolha extends Pergunta {

	private Alternativa[] alternativas;

	public MultiplaEscolha(String enunciado) {
		this(enunciado, 2);
	}
	
	public MultiplaEscolha(String enunciado, int numAlternativas) {
		super(enunciado);
		this.alternativas = new Alternativa[numAlternativas];
	}

	public void adicionaAlternativa(String novaAlternativa) throws Exception {
		adicionaAlternativa(new Alternativa(novaAlternativa));
	}
	
	public void adicionaAlternativa(Alternativa novaAlternativa) throws Exception {
		boolean conseguiuAdicionar = false;
		
		for (int i = 0; i < alternativas.length && !conseguiuAdicionar; i++)
			if (alternativas[i] == null) {
				alternativas[i] = novaAlternativa;
				conseguiuAdicionar = true;
			}
			
		if (!conseguiuAdicionar)
			throw new Exception("Nao adicionou alternativa.");
	}
	
	@Override
	public void imprimirPergunta() {
		System.out.println("Enunciado: " + getEnunciado());
		for (Alternativa elemento: this.alternativas)
			System.out.println("- " + elemento.getTexto());
	}
	
}