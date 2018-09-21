import estrutura.*;
import objetos.*;

public class PrincipalGenerics {

	public static void main(String[] args) {
	
		try {
			Eletronico tablet = new Tablet("1234");
			Eletronico notebook1 = new Notebook("5678", 2);
			Eletronico notebook2 = new Notebook("0000", 25);
			
			PilhaGenericaEletronicos<Eletronico> p1 = new PilhaGenericaEletronicos<>(10); // Esta pilha armazena somente eletronicos
			p1.empilha(tablet);
			p1.empilha(notebook1);
			p1.empilha(notebook2);
			
			for (int i = 0; i < 3; i++)
				System.out.println("Item P1: " + p1.desempilha());
			
		} catch (PilhaCheiaException e) {
			System.out.println("Pilha esta cheia!");
		} catch (PilhaVaziaException e) {
			System.out.println("Pilha esta vazia!");
		} catch (Exception e) {
			System.out.println("Outro erro: " + e);
		}
	}

}