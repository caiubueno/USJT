package Chain;

public class Slot200 implements Slot {

	@SuppressWarnings("unused")
	private Slot slot;

	public Slot200() {
	}

	@Override
	public double Moeda(int m) {
		if (m == 200) {
			System.out.println("Recebeu R$2,00");
			return 2;
		} else {
			return 0;
		}

	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
	}

}
