package estrutura;

public class PilhaCheiaException extends PilhaException {

	private int limite;
	private Object item;
	public PilhaCheiaException(int limite, Object item) {
		this.limite = limite;
		this.item = item;
	}

	public int getLimite() {
		return this.limite;
	}

	public Object getItem() {
		return this.item;
	}
}
