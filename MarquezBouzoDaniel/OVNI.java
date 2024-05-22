package MarquezBouzoDaniel;

public class OVNI extends ObjetoEspacial {
	// Apartado c, hereda de objetoespacial y siempre guarda el nombre desconocido
	public OVNI(float masa, float velocidad, String nombre) {
		super(masa, velocidad, nombre);
		this.setNombre("desconocido");
	}

}
