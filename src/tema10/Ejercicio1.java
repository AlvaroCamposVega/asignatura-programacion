package tema10;

/*
*
* EJERCICIO 1
* Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
* muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
* todo el ArrayList sin usar ningún índice.
*
*/

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
