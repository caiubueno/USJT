package ArqDev;

public class Incrementar {

	private static int count = 0; 
	private int numero;
	private static Incrementar inc;
	
	private Incrementar() { 
		
		numero = ++count;
	}
	
	public static Incrementar getInstance() {
		if(inc==null) {
			inc = new Incrementar();
		}
		return inc;
	}
	

	public String toString() {
		return "Incremental " + numero; 
	}
}
