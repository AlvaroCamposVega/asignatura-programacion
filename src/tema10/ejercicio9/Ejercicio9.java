package tema10.ejercicio9;

import java.util.ArrayList;

/*
*
* EJERCICIO 9
* Modifica el programa anterior de tal forma que las cartas se muestren ordenadas.
* Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
* coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
*
*/

public class Ejercicio9 {

	public static void main(String[] args) {

		ArrayList<Carta> a = new ArrayList<Carta>();
		Carta c = new Carta();
		a.add(c);
		boolean e;
		
		for (int i = 0; i < 9; i++) {
			
			e = true;
			
			while (e) { // Hacemos que la nueva carta no sea repetida
				
				e = false;
				c = new Carta();
				
				for (Carta b : a) {
					
					if (b.repetida(c)) {
						
						e = true;
					}
				}
			}
			
			a.add(c);
		}
		
		a.sort(null);
		
		for (Carta b : a) {
			
			System.out.println(b);
		}
	}

}
