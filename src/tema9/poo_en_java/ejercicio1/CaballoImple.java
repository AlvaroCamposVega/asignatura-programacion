/* 
 * 
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 * 
 */
package tema9.poo_en_java.ejercicio1;

public class CaballoImple {

	public static void main(String[] args) {

		Caballo gordoncho = new Caballo("Gordoncho", "macho", "dorado");
		System.out.println(gordoncho.acariciar());
		System.out.println(gordoncho.pasear());
		
		Caballo lolita = new Caballo("Lolita", "hembra", "blanco");
		System.out.println(lolita.acariciar());
		System.out.println(lolita.pasear());
		
		System.out.println(gordoncho);
	}

}
