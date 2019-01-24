package tema10;
import java.util.ArrayList;
import java.util.Scanner;
/*
*
* EJERCICIO 3
* Escribe un programa que ordene 10 números enteros introducidos por teclado
* y almacenados en un objeto de la clase ArrayList.
*
*/

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		System.out.println("A continuación vas a introducir 10 números enteros");
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("Introduce un número entero: ");
			a.add(Integer.parseInt(s.nextLine()));
		}
		
		System.out.println("\n" + a);
		a.sort(null);
		System.out.println(a);
	}

}
