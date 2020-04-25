package ArqDev;

public class Programa {

	public static void main(String[] args) {
		//COLOCAR NOMES AQUI
		String[] lista = {"Goku, Son", "Asta Black Clover", "D Luffy , Monckey", "YouTube, Baguncinha"};
		//se nada for passado como parâmetro
		if(args.length == 0) {
			args = lista;
		}
		Nomes nomes = new Nomes(args);
	}

}
