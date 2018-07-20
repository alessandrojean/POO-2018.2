public class PrincipalConta {

	public static void main(String[] args) {
		try {
			Conta conta1 = new Conta("Pessoa teste");
			conta1.depositar(100);
			conta1.sacar(20);
			conta1.setLimite(100);
			System.out.println(conta1);
			conta1.sacar(180);
			System.out.println(conta1);
			conta1.sacar(1);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
			System.out.println("O saldo para saque eh " + e.getSaldo());
		}
	}

}