package tema10;

import java.util.ArrayList;
import java.util.Scanner;

/*
*
* EJERCICIO 4
* Realiza un programa equivalente al anterior pero en esta ocasión, el programa
* debe ordenar palabras en lugar de números.
*
*/

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		
		System.out.println("A continuación vas a introducir 10 palabras.");
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("Introduce una palabra: ");
			a.add(s.nextLine());
		}
		
		System.out.println("\n" + a);
		a.sort(null);
		System.out.println(a);
	}

}
