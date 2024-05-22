package MarquezBouzoDaniel;

public class Ejercicio1 {
	// Ejercicio 1 Apartado A.
	public static int PrimerNegativo(int[] x) {
		// Creo la variable posicion dandole un valor de -1 por si no hay valores
		// negativos en el array
		int posicion = -1;
		// Recorro el array buscando el primer valor menor a 0 y al encontrarlo salgo
		// del bucle
		for (int i = 0; i < x.length; i++) {
			if (x[i] < 0) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}

	// Ejercicio 1 Apartado B
	public static int PrimerDigito(String x) {
		// Creo la variable posicion dandole un valor de -1 por si no hay valores
		// negativos en el array
		int posicion = -1;
		// Recorro el array buscando el primer valor numérico y al encontrarlo salgo del
		// bucle
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == '0' || x.charAt(i) == '1' || x.charAt(i) == '2' || x.charAt(i) == '3'
					|| x.charAt(i) == '4' || x.charAt(i) == '5' || x.charAt(i) == '6' || x.charAt(i) == '7'
					|| x.charAt(i) == '8' || x.charAt(i) == '9') {
				posicion = i;

			}
		}
		return posicion;
	}

	// Ejercicio 1 Apartado C
	public static int ContarValores(int[] x) {
		// Creo la variable valores para contar los valores entre -5 y +5
		int valores = 0;
		// Recorro la matriz sumando 1 cuando el valor está entre -5 y +5
		for (int i = 0; i < x.length; i++) {
			if (x[i] > -5 && x[i] < 5) {
				valores++;
			}
		}
		return valores;
	}

	// Ejercicio 1 Apartado D
	public static String SepararNotas(int[] x) {
		// Creo las 4 variables distintas

		int suspenso = 0;
		int aprobado = 0;
		int sobresaliente = 0;
		int error = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] < 5 && x[i] >= 0) {
				suspenso++;
			} else if (x[i] < 7 && x[i] >= 5) {
				aprobado++;
			} else if (x[i] >= 7 && x[i] <= 10) {
				sobresaliente++;
			} else if (x[i] < 0 || x[i] > 10) {
				error++;
			}
		}
		return "Numero de suspensos (<5):" + suspenso + "\nNumero de aprobados (<7):" + aprobado
				+ "\nNumero de sobresalientes (>=7 y <=10): " + sobresaliente + "\nNumero de errores (<0 y >10): "
				+ error;
	}
}
