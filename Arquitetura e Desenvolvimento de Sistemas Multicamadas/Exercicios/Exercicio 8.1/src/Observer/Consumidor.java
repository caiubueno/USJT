package Observer;

public class Consumidor implements ConsomeNoticia {
	

	@Override
	public void consomeNoticia(Noticia noticia) {
		System.out.println(noticia);
		
	}

}