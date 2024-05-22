package MarquezBouzoDaniel;

import java.util.HashSet;

public class PrincipalEjercicio2 {

	public static void main(String[] args) {
		// Apartado H Guardo 4 objetos espaciales en una matriz
		HashSet<ObjetoEspacial> ObjetosEspaciales = new HashSet<ObjetoEspacial>();
		ObjetosEspaciales.add(new ObjetoEspacial(5555f, 5555f, "Meteorito"));
		ObjetosEspaciales.add(new ObjetoEspacial(555f, 555f, "Luna"));
		ObjetosEspaciales.add(new ObjetoEspacial(55555f, 5555f, "Tierra"));
		ObjetosEspaciales.add(new ObjetoEspacial(44444f, 44444f, "Sol"));
		// Apartado I Al ser hashset que guarda por el nombre, no se pueden guardar 2
		// iguales
		// Apartado J Recorro la matriz de objetosespaciales y imprimo por pantalla la
		// masa y el nombre de cada uno
		for (ObjetoEspacial o : ObjetosEspaciales) {
			System.out.println("Nombre del objeto: " + o.getNombre() + "\nMasa del objeto: " + o.getMasa());
		}

		// Apartado K Obtengo el objeto más pesado 2 a 2 y obtengo el más pesado de
		// todos.
		// Lo transformo a un array normal para poder trabajar con las posiciones en el
		// array creo que podría hacer un bucle en el hashset para sacar cual sería el
		// objeto más pesado
		ObjetoEspacial[] objetosarray = ObjetosEspaciales.toArray(new ObjetoEspacial[ObjetosEspaciales.size()]);
		ObjetoEspacial Pesado1 = ObjetoEspacial.getObjetoMasivo(objetosarray[0], objetosarray[1]);
		ObjetoEspacial Pesado2 = ObjetoEspacial.getObjetoMasivo(objetosarray[2], objetosarray[3]);
		ObjetoEspacial MasPesado = ObjetoEspacial.getObjetoMasivo(Pesado1, Pesado2);
		System.out.println("El objeto más masivo es: " + MasPesado.getNombre());

		// Prueba desintegrar
		System.out.println(objetosarray[0].toString());
		ObjetoEspacial.desintegrar(objetosarray[0]);
		System.out.println(objetosarray[0].toString());
	}

}
