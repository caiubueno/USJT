package ArqDev;

public class PizzaCalabresa extends PizzaFactory {

	@Override
	public Sabor montarPizza() {
		return new Calabresa();
	}

	@Override
	public Pizzaiolo SelecionaPizzaiolo() {
		
		return new Pizzaiolo1();
	}

}
