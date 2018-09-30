/*
*
* EJERCICIO 3
* dada un número del 1 al 7 muestra el día de la semana
*
*/

public class Ejercicio3 {
  public static void main(String[] args) {
  
	System.out.print("Introduzce un número del 1 al 7: ");
    int num = Integer.parseInt(System.console().readLine());

	if (num == 1) {
		
		System.out.print("Lunes");
		
	} else if (num == 2) {
		
		System.out.print("Martes");
		
	} else if (num == 3) {
		
		System.out.print("Miércoles");
		
	} else if (num == 4) {
		
		System.out.print("Jueves");
		
	} else if (num == 5) {
		
		System.out.print("Viernes");
		
	} else if (num == 6) {
		
		System.out.print("Sábado");
		
	} else if (num == 7) {
		
		System.out.print("Domingo");
		
	} else {
		
		System.out.print("Introduzca un número del 1 al 7 por favor");
	}
  }
}
