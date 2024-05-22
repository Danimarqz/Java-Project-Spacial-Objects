package MarquezBouzoDaniel;

public class Ejercicio1Principal {

	public static void main(String[] args) {
		// Prueba método 1
		int[] prueba1 = { 1, 2, -4, 4, 9, -3 };
		System.out.println(Ejercicio1.PrimerNegativo(prueba1));
		// Prueba método 2
		String prueba = "jj1";
		System.out.println(Ejercicio1.PrimerDigito(prueba));
		// Prueba método 3
		System.out.println(Ejercicio1.ContarValores(prueba1));
		// Prueba método 4
		System.out.println(Ejercicio1.SepararNotas(prueba1).toString());
	}

}
