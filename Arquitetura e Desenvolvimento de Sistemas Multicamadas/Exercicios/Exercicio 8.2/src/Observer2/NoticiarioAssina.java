package Observer2;

public class NoticiarioAssina extends Noticiario {
	ConsomeNoticia consumidor;

	public NoticiarioAssina(ConsomeNoticia consumidor) {
		this.consumidor = consumidor;
	}
	

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
	
		consumidor.consomeNoticia(textoNoticia, dia, mes, topico);
	}
	

}
