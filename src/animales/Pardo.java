package animales;

public class Pardo {
	private String nombre;
	private String raza;
	private String hermano;
	private String personalidad;
	private String caracteristica;
	
	public Pardo(String nombre, String raza, String hermano, String personalidad, String caracteristica) {
		this.nombre = nombre;
		this.raza = raza;
		this.hermano = hermano;
		this.personalidad = personalidad;
		this.caracteristica = caracteristica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getHermano() {
		return hermano;
	}

	public void setHermano(String hermano) {
		this.hermano = hermano;
	}

	public String getPersonalidad() {
		return personalidad;
	}

	public void setPersonalidad(String personalidad) {
		this.personalidad = personalidad;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	

}
