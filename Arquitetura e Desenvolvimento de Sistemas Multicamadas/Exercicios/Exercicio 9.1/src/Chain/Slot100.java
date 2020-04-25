package Chain;

public class Slot100 implements Slot {

	private Slot slot;

	public Slot100() {
	}

	@Override
	public double Moeda(int m) {
		if (m == 100) {
			System.out.println("Recebeu R$1,00");
			return 1;
		} else {
			return this.slot.Moeda(m);
		}

	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
	}

}
