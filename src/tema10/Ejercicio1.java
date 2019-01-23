package tema10;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		ArrayList<String> companeros = new ArrayList<String>();
		
		companeros.add("Laura");
		companeros.add("Alejandro");
		companeros.add("Rubén");
		companeros.add("Clara");
		companeros.add("Borja");
		companeros.add("Lino");
		
		for (String nombre : companeros) {
			
			System.out.println(nombre);
		}
	}

}
