package ArqDev;

import java.util.Scanner;

public class Programa {


	public static void main(String[] args) {
		
	try (Scanner t = new Scanner(System.in)) {
		System.out.println("Digite Qualque Coisa: ");
		String texto = t.nextLine();
		TransformadorDeTextos maiusculo = new Maiusculo();
		maiusculo.run(texto);
		TransformadorDeTextos minusculo = new Minusculo();
		minusculo.run(texto);
		TransformadorDeTextos duplicar = new Duplicar();
		duplicar.run(texto);
		TransformadorDeTextos inverter = new Inverter();
		inverter.run(texto);
	}
	
	}
}