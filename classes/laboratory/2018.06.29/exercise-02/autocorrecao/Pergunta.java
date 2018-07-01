package autocorrecao;

public class Pergunta {

	private String enunciado;
	
	public Pergunta(String enunciado) {
		this.enunciado = enunciado;
	}
	
	public String getEnunciado() {
		return this.enunciado;
	}

	public void imprimirPergunta() {
		System.out.println("Enunciado: " + this.enunciado);
	}
}