package autenticacao;

public class UsuarioNaoAutenticadoException extends Exception {

	public UsuarioNaoAutenticadoException() {
		super("Usuario nao foi autenticado!");
	}

}