package ArqDev;

public class TesteIncremental {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { 
			Incrementar inc = Incrementar.getInstance();
	
			
			
			System.out.println(inc);
		} 
	}
}
