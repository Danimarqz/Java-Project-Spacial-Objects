package MarquezBouzoDaniel;

public class Estrella extends ObjetoEspacial {
	float luminosidad;
	float temperatura;
	char tipo;

	// Apartado A
	public Estrella() {
		super();
		// Constructor por defecto
	}

	public Estrella(float masa, float velocidad, String nombre, float luminosidad, float temperatura) {
		super(masa, velocidad, nombre);
		setLuminosidad(luminosidad);
		setTemperatura(temperatura);
		setTipo();
		// Constructor con todos los parámetros menos el tipo
	}

	// Setters y getters apartado B
	public float getLuminosidad() {
		return luminosidad;
	}

	public void setLuminosidad(float luminosidad) {
		if (luminosidad >= 0 && luminosidad <= 1) {
			this.luminosidad = luminosidad;
			setTipo();
		}
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		if (temperatura >= 1 && temperatura <= 10) {
			this.temperatura = temperatura;
			setTipo();
		}
	}

	public char getTipo() {
		return tipo;
	}

	// Apartado B, settipo privado y se actualiza en settemperatura y setluminosidad
	private void setTipo() {
		if (luminosidad > 0.5 && temperatura > 5) {
			this.tipo = 'K';
		} else if (luminosidad > 0.5 && temperatura < 5) {
			this.tipo = 'F';
		} else if (luminosidad < 0.5 && temperatura > 5) {
			this.tipo = 'G';
		} else if (luminosidad < 0.5 && temperatura < 5) {
			this.tipo = 'M';
		}
	}

	@Override
	public String toString() {
		return "Estrella [luminosidad=" + luminosidad + ", temperatura=" + temperatura + ", tipo=" + tipo + ", Masa= "
				+ getMasa() + ", Velocidad= " + getVelocidad() + ", Nombre= " + getNombre() + "universo=" + universo

				+ "]";
	}

}
