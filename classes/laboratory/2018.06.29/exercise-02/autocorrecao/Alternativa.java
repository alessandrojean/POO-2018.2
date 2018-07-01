package autocorrecao;

public class Alternativa {

	private String textoAlternativa;
	
	// Construtor
	public Alternativa(String texto) throws Exception {
		setTexto(texto);
	}
	
	public void setTexto(String texto) throws Exception {
		if (texto.length() < 1)
			throw new Exception("O texto da alternativa tem q ser maior q 1.");
		this.textoAlternativa = texto;
	}

	public String getTexto() {
		return this.textoAlternativa;
	}
	
}