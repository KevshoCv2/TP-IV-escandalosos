package animales;

public class Polar {
	private String nombre;
	private String raza;
	private String hermano;
	private String talento;
	private String caracteristica;
	
	public Polar(String nombre, String raza, String hermano, String talento, String caracteristica) {
		this.nombre = nombre;
		this.raza = raza;
		this.hermano = hermano;
		this.talento = talento;
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

	public String getTalento() {
		return talento;
	}

	public void setTalento(String talento) {
		this.talento = talento;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	

}
