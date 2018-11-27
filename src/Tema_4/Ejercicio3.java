package Tema_4;

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

	switch (num) {

		case 1:
		
			System.out.print("Lunes");
			break;
		
		case 2:
		
			System.out.print("Martes");
			break;
		
		case 3:
		
			System.out.print("Miércoles");
			break;
		
		case 4:
		
			System.out.print("Jueves");
			break;
		
		case 5:
		
			System.out.print("Viernes");
			break;
		
		case 6:
		
			System.out.print("Sábado");
			break;
		
		case 7:
		
			System.out.print("Domingo");
			break;
		
		default:
		
			System.out.print("Introduzca un número del 1 al 7 por favor");
	}
  }
}
