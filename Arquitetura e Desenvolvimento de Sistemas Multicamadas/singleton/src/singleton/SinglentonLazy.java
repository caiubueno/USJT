package singleton;

public class SinglentonLazy {
	private static SinglentonLazy sc = null;
			private SinglentonLazy() { }
	public static synchronized SinglentonLazy getIntance() {
		if (sc == null) {
			sc = new SinglentonLazy();
		}
		return sc;
	}
}
