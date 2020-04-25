package Chain;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Aplicativo {

	public static void main(String[] args) {
		
		NumberFormat plotDecimal = new DecimalFormat("#0.00");
		
		Slot slot5 = new Slot5();
		Slot slot10 = new Slot10();
		Slot slot25 = new Slot25();
		Slot slot50 = new Slot50();
		Slot slot100 = new Slot100();
		Slot slot200 = new Slot200();
		
		slot5.setSlot(slot10); //Atribui ao próximo
		slot10.setSlot(slot25);
		slot25.setSlot(slot50);
		slot50.setSlot(slot100);
		slot100.setSlot(slot200);
		
		double valor = 0;
		
		/********************Livros**********************************/
		String item = JOptionPane.showInputDialog("----Máquina de Livros/quadrinhos----\n"
				+ "Escolha o livro: \n"
				+ "1 Batman vs Superman - R$2,00;\n "
				+ "2 The joker - R$4,50; \n"
				+ "3 IT - R$5,90;\n"
				+ "4 Lords of the ring - R$10,00;");
		switch (item) {
		case "1":
			valor = 2.00;
			break;
		case "2":
			valor = 4.50;
			break;
		case "3":
			valor = 5.90;
		case "4":
			valor = 10.00;
			break;
		default:
			System.out.println("Produto invalido");
				
		}
		double Valorinserido = 0;
		
		if (valor > 0) {
			
			while (valor>Valorinserido) {
				
				System.out.println("-- Total inserido: R$"+plotDecimal.format(Valorinserido));
				
				double nova = slot5.Moeda(Integer.parseInt(JOptionPane.showInputDialog("Insira uma moeda (5, 10, 25, 50, 100, 200)")));
				
				Valorinserido +=nova;
			}
			double troco = Valorinserido - valor;
			
			System.out.println("Total a pagar:  R$"+plotDecimal.format(valor));
			System.out.println("Total: R$"+plotDecimal.format(Valorinserido));
			System.out.println("Troco: R$"+plotDecimal.format(troco));
		}
		

	}

}
