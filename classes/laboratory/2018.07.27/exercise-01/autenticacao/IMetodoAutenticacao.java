package autenticacao;

public interface IMetodoAutenticacao {

	// Retorna o nome do usuário autenticado (null significa que a autenticacao falhou)
	UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException;

}