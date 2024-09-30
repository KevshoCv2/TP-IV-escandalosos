package animales;

public class Panda {
	private String nombre;
	private String raza;
	private String hermano;
	private String influencer;
	private String caracteristica;
	
	public Panda(String nombre, String raza, String hermano, String influencer, String caracteristica) {
		this.nombre = nombre;
		this.raza = raza;
		this.hermano = hermano;
		this.influencer = influencer;
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

	public String getInfluencer() {
		return influencer;
	}

	public void setInfluencer(String influencer) {
		this.influencer = influencer;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	

}
