package MarquezBouzoDaniel;

import java.util.Objects;

public class ObjetoEspacial {
	private float masa;
	private float velocidad;
	private String nombre;
	// Apartado A (cambio a protected para poder acceder desde las otras clases)
	protected static String universo = "Via lactea";

	// Apartado B Constructor con 3 atributos
	public ObjetoEspacial(float masa, float velocidad, String nombre) {
		super();
		this.masa = masa;
		this.velocidad = velocidad;
		this.nombre = nombre;
	}

	// Apartado B Constructor por defecto
	public ObjetoEspacial() {

	}

	// Apartado C
	public float getMasa() {
		return masa;
	}

	public void setMasa(float masa) {
		// Solo se puede guardar la masa si es positiva
		if (masa > 0) {
			this.masa = masa;
		}
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		// Solo se puede guardar la velocidad si es positiva
		if (velocidad > 0) {
			this.velocidad = velocidad;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static String getUniverso() {
		return universo;
	}

	public static void setUniverso(String universo) {
		ObjetoEspacial.universo = universo;
	}

	// Apartado D
	@Override
	public String toString() {
		return "ObjetoEspacial [masa=" + masa + ", velocidad=" + velocidad + ", nombre=" + nombre + "universo="
				+ universo + "]";
	}

	// Apartado E
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjetoEspacial other = (ObjetoEspacial) obj;
		return Objects.equals(nombre, other.nombre);
	}

	// Apartado F
	public static void desintegrar(ObjetoEspacial o) {
		// Guardo la masa nueva (masa actual - 10% de reduccion)
		float MasaNueva = (float) (o.getMasa() - o.getMasa() * 0.1);
		// Aplico la masa nueva
		o.setMasa(MasaNueva);
		// Guardo la velocidad nueva (velocidad actual + 15% de aumento)
		float VelocidadNueva = (float) (o.getVelocidad() + o.getVelocidad() * 0.15);
		// Aplico la velocidad nueva
		o.setVelocidad(VelocidadNueva);
	}

	// Apartado G
	public static ObjetoEspacial getObjetoMasivo(ObjetoEspacial o, ObjetoEspacial e) {
		// Si o tiene más masa devuelvo o
		if (o.getMasa() > e.getMasa()) {
			return o;
			// Si e tiene más masa devuelvo e
		} else {
			return e;
		}
	}
}
