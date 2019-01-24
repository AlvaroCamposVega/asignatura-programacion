package tema10;

import java.util.HashMap;
import java.util.Scanner;

/*
*
* EJERCICIO 6
* Implementa el control de acceso al área restringida de un programa. Se debe
* pedir un nombre de usuario y una contraseña. Si el usuario introduce los
* datos correctamente, el programa dirá “Ha accedido al área restringida”. El
* usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
* el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
* de usuario con sus correspondientes contraseñas deben estar almacenados
* en una estructura de la clase HashMap.
*
*/


public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int o = 3;
		HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("alvaro", "1234");
		h.put("popeye", "1");
		h.put("nick", "hola");
		h.put("x", "y");
		
		while (o > 0) {
		
			System.out.print("Introduce un nombre de usuario: ");
			String user = s.nextLine().toLowerCase();
			
			System.out.print("Introduce una contraseña: ");
			String passwd = s.nextLine().toLowerCase();
			System.out.println();
			
			if (h.containsKey(user) && h.containsValue(passwd)) {
				
				if (h.get(user).equals(passwd)) {
					
					System.out.println("Ha accedido al área restringida");
					o = 0;
					
				} else {
					
					o -= 1;
					
					if (o == 0) {
						
						System.out.println("Lo siento, no tiene acceso al área restringida");
					}
				}
				
			} else {
				
				o -= 1;
				
				if (o == 0) {
					
					System.out.println("Lo siento, no tiene acceso al área restringida");
				}
			}
		}
		
	}

}
