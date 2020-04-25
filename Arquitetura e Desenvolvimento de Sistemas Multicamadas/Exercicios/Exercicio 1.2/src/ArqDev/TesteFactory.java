package ArqDev;

public class TesteFactory {

	public static Pizza montarPizza(String sabor) {
		PizzaFactory pf	= null;
		
		switch (sabor) {
		case "Segunda": 
			pf = new PizzaCalabresa();
			break;
		case "Quarta": 
			pf = new PizzaCalabresa();
			break;
		case "Sexta": 
			pf = new PizzaCalabresa();
			break;				
		case "Ter�a":
			pf = new PizzaPresuntoFactory();
			break;
		case "Quinta":
			pf = new PizzaPresuntoFactory();
			break;
		case "Sabado":
			pf = new PizzaPresuntoFactory();
			break;
		}		
		
		
		Pizza pizza = new Pizza();
		pizza.setSabor((pf.montarPizza()));
		pizza.setPizzaiolo((pf.SelecionaPizzaiolo()));
		
		return pizza;
	}

	public static void main(String[] args) {
		montarPizza("Segunda");
		montarPizza("Sabado");
	}

}