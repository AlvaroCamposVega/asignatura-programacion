package Tema_4;

/*
*
* EJERCICIO 2
* dada una hora muestra buenos días, buenas tardes o buenas noches
*
*/

public class Ejercicio2 {
  public static void main(String[] args) {
  
	System.out.print("Introduzce una hora sin minutos: ");
    int hora = Integer.parseInt(System.console().readLine());

	if ((hora >= 6) && (hora <= 12)) {
		
		System.out.print("buenos días");
		
	} else if ((hora >= 13) && (hora <= 20)) {
		
		System.out.print("buenas tardes");
		
	} else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5)) {
		
		System.out.print("buenas noches");
		
	} else {
		
		System.out.print("Introduzca una hora por favor");
	}
  }
}
