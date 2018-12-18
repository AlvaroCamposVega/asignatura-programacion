package tema9.poo_en_java.ejercicio1;

public class Caballo {
	
	private String nombre;
	private String sexo;
	private String tonoPiel;

	public Caballo() {
		
	}
	
	public Caballo(String nombre, String sexo, String tonoPiel) {
		
		this.nombre = nombre;
		this.sexo = sexo.toLowerCase();
		this.tonoPiel = tonoPiel.toLowerCase();
	}

	public String pasear() {
		
		return nombre + " y tú habeis paseado " + ((int)(Math.random() * 2000) + 1) + " metro/s";
	}
	
	public String acariciar() {
		
		return "A " + nombre + " Le gusta mucho que le acaricies";
	}

	public void setSexo(String sexo) {
		
		this.sexo = sexo;
	}

	public String getTonoPiel() {
		
		return tonoPiel;
	}

	public void setTonoPiel(String tonoPiel) {
		
		this.tonoPiel = tonoPiel;
	}

}
