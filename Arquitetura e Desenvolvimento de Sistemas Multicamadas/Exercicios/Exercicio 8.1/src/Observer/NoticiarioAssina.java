package Observer;

public class NoticiarioAssina extends Noticiario{
	
	Noticia noticia;
    Consumidor consumidor = new Consumidor();
	
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		
		this.noticia = new Noticia(textoNoticia,dia,mes,topico);
		this.notificarConsumidores();
			
		
	}
	
		public void notificarConsumidores() {
			System.out.println("Todos os otomes e mangakas foram notificados Inclusive meu avó que espera a 20 anos terminar essa obra!");
			consumidor.consomeNoticia(noticia);
			
			
		}
		

		
	}
