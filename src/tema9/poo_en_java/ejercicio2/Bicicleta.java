package tema9.poo_en_java.ejercicio2;

public class Bicicleta extends Vehiculo {

	private String color = "rojo";
	
	public Bicicleta(String color) {
		
		super();
		this.color = color;
	}
	
	public void caballito() {
		
		System.out.println("¡He hecho el caballito!\n");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
