package autenticacao;

public class UsuarioAutenticado {
	private int cod;
	private String nome;
	
	public UsuarioAutenticado(int cod, String nome) {
		this.cod = cod;
		this.nome = nome;
	}
	
	public int getCodigo() {
		return this.cod;
	}
	
	public String getNome() {
		return this.nome;
	}
}