package Observer2;

public class Programa {
	public static void main(String[] args) {
		ConsomeNoticia agregadorTopico = new AgregadorTopico("jogos");
		Noticiario noticiario = new NoticiarioAssina(agregadorTopico);
		noticiario.notificaNoticia("a", 1, 1, "jogos");
		noticiario.notificaNoticia("b", 2, 1, "jogos");
		noticiario.notificaNoticia("c", 2, 1, "jogos");
		noticiario.notificaNoticia("d", 3, 1, "jogos");
		noticiario.notificaNoticia("e", 3, 1, "jogos");
		noticiario.notificaNoticia("outra coisa", 3, 1, "outro");
		noticiario.notificaNoticia("f", 3, 1, "jogos");
		noticiario.notificaNoticia("g", 3, 1, "jogos");
		noticiario.notificaNoticia("h", 3, 1, "jogos");

		
		System.out.println("***************************************************");
		
		ConsomeNoticia agregadorMensal = new AgregadorMensal();
		noticiario = new NoticiarioAssina(agregadorMensal);
		noticiario.notificaNoticia("Yu Yu hakusho", 1, 1, "Anime");
		noticiario.notificaNoticia("Hunter x Hunter", 2, 1, "Anime");
		noticiario.notificaNoticia("Death Note", 2, 1, "Anime");
		noticiario.notificaNoticia("Tenchi Muyo!", 3, 1, "Anime");
		noticiario.notificaNoticia("One-Punch Man", 3, 1, "Anime");
		noticiario.notificaNoticia("NONONONONONON", 3, 1, "outro");
		noticiario.notificaNoticia("Charlotte", 3, 1, "Anime");
		noticiario.notificaNoticia("Death Parade", 3, 1, "Anime");
		noticiario.notificaNoticia("Attack on Titan", 3, 1, "Anime");
		noticiario.notificaNoticia("Orange", 3, 1, "Anime");
		noticiario.notificaNoticia("Sword Art Online", 3, 1, "Anime");
		noticiario.notificaNoticia("Kiseiju:", 4, 2, "Anime");
		noticiario.notificaNoticia("Berserk", 4, 2, "Anime");

	}
}
