import estrutura.PilhaE;
import estrutura.PilhaCheiaException;
import estrutura.PilhaVaziaException;
import objetos.*;

public class Principal {

	public static void main(String[] args) {
	
		try {
			Eletronico tablet = new Tablet("1234");  // Parametro: serial
			Eletronico notebook1 = new Notebook("5678", 2); // Parametros: serial e numero de USBs
			Eletronico notebook2 = new Notebook("0000", 25); // Parametros: serial e numero de USBs
			
			PilhaE p1 = new PilhaE(10);
			p1.empilha(tablet);
			p1.empilha(notebook1);
			p1.empilha(notebook2);
			
			PilhaE p2 = p1.clone();
			p2.empilha(new Tablet("ABCD")); // Parametro: serial
			p2.empilha(new NotebookGrande("QWE")); // Um notebook grande tem 25 USBs
			p2.empilha(new NotebookGrande("ASD")); // Um notebook grande tem 25 USBs
			
			notebook1.setSerial("1234567890"); // Altera serial de um notebook da pilha 1
			
			for (int i = 0; i < 3; i++)
				System.out.println("Item P1: " + p1.desempilha());
			
			System.out.println();
			for (int i = 0; i < 6; i++)
				System.out.println("Item P2: " + p2.desempilha());
			
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone nao suportado!");
		} catch (PilhaCheiaException e) {
			System.out.println("Pilha esta cheia!");
		} catch (PilhaVaziaException e) {
			System.out.println("Pilha esta vazia!");
		} catch (Exception e) {
			System.out.println("Outro erro: " + e);
		}
	}

}