package ArqDev;

import java.util.ArrayList;

public class ArmazemNomesDesvirgulados extends ArmazemNomes {

	public ArmazemNomesDesvirgulados(ArrayList<Nome> nomes) {
		super(nomes);
	}

	@Override
	protected CriadorDeNomes getCriador() {
		return new CriadorDeNomesDesvirgulados();

	}
}
