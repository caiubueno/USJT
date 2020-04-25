package ArqDev;

import java.util.Arrays;

public class Ordem {
	public void Ordenar(int v[]) {
		int p;
		int contador = 0;
		for (int i = 0; i < v.length; i++) {
			contador++;
		}
		p = 0;
		QuickSort(v[], p, contador - 1);
		System.out.println("QuickSort: " + Arrays.toString(v));
	}
}
