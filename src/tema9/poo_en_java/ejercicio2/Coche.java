package tema9.poo_en_java.ejercicio2;

public class Coche extends Vehiculo {

	private String marca = "bmv";
	
	public Coche(String marca) {

		super();
		this.marca = marca;
	}
	
	public void quemarRueda() {
		
		System.out.println("¡BROOMM! ¡Menuda humareda!\n");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
