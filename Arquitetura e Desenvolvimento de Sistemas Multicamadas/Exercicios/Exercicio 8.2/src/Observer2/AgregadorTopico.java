package Observer2;

import java.util.ArrayList;
import java.util.List;

public class AgregadorTopico implements ConsomeNoticia {
	String topico;
	List<Conteudo> conteudos = new ArrayList<>();

	public AgregadorTopico(String topico) {
		this.topico = topico;
	}

	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		if (this.topico.equals(topico)) {
			Conteudo conteudo = new Conteudo(textoNoticia, dia, mes, topico);
			conteudos.add(conteudo);
		}
		if (conteudos.size() >= 10) {
			System.out.println("Ja temos 10 noticias do mesmo topico:");
			conteudos.forEach(c -> System.out.println(c));
			conteudos.clear();
		}
	}

}