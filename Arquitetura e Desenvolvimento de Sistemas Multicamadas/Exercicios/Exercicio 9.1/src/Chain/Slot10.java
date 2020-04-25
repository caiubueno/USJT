package Chain;

public class Slot10 implements Slot {
	private Slot slot;

	public Slot10() {
	};

	@Override
	public double Moeda(int m) {
		if (m == 10) {
			System.out.println("Recebeu R$0,10");
			return 0.1;
		} else {
			return this.slot.Moeda(m);
		}
	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
	}

}
