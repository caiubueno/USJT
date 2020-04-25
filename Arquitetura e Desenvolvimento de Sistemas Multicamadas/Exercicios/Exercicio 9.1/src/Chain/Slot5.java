package Chain;

public class Slot5 implements Slot {
	private Slot slot;

	public Slot5() {
	};

	@Override
	public double Moeda(int m) {
		if (m == 5) {
			System.out.println("Recebeu R$0,05");
			return 0.05;
		} else {
			return this.slot.Moeda(m);
		}

	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
	}

}