package objetos;

public class NotebookGrande extends Notebook {
	public NotebookGrande(String serial) {
		super(serial, 25);
	}
	
	@Override
	public String toString() {
		return "NotebookGrande-" + getSerial()+"-25";
	}
	

}