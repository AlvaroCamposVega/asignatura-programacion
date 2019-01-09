/*
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú 
 * 
 */

package tema9.poo_en_java.ejercicio2;

public class Vehiculo {
	
	private static int vehiculosCreados = 0;
	private static int kilometrosTotales = 0;
	private int kilometrosRecorridos = 0;

	public Vehiculo() {
		
		Vehiculo.vehiculosCreados += 1;
	}
	
	public void andar() {
		
		int km = (int)(Math.random() * 20) + 1;
		this.kilometrosRecorridos += km;
		Vehiculo.kilometrosTotales += km;
	}

	public static int getVehiculosCreados() {
		
		return vehiculosCreados;
	}

	public static int getKilometrosTotales() {
		
		return kilometrosTotales;
	}

	public int getKilometrosRecorridos() {
		
		return kilometrosRecorridos;
	}

}
