package MarquezBouzoDaniel;

import java.util.ArrayList;

public class Ejercicio3Principal {
	public static void main(String[] args) {
		// Apartado D arraylist de objetos espaciales
		ArrayList<ObjetoEspacial> objetos = new ArrayList<ObjetoEspacial>();
		objetos.add(new Estrella(4444f, 4444f, "Estrella K1232131", 0.4f, 5.1f));
		objetos.add(new OVNI(300000f, 1f, ""));
		objetos.add(new ObjetoEspacial(33333f, 43432432f, "Tierra2"));
		// Apartado E mostrar por pantalla los datos de los objetos que sean estrellas
		for (ObjetoEspacial o : objetos) {
			if (o instanceof Estrella) {
				System.out.println(o.toString());
			}
		}

		// Apartado F creo un contador
		int contadorOVNI = 0;
		// Recorro el arraylist y si son ovnis aumento el contador
		for (ObjetoEspacial o : objetos) {
			if (o instanceof OVNI) {
				contadorOVNI++;
			}
		}
		System.out.println("Numero de OVNIS registrados: " + contadorOVNI);
	}
}
