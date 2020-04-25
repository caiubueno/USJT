package ArqDev;

public class SingletonTest {
	public static void main(String args[]) {
		Deck deck =  Deck.getInstance();
		deck.print( );
	}
}
