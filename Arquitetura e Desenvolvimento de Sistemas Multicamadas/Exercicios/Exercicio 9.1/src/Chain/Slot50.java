package Chain;

public class Slot50 implements Slot {

	private Slot slot;

	public Slot50() {
	};

	@Override
	public double Moeda(int m) {
		if (m == 50) {
			System.out.println("Recebeu R$0,50");
			return 0.5;
		} else {
			return this.slot.Moeda(m);
		}

	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
	}

}
