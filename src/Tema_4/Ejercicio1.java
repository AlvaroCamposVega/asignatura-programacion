package Tema_4;

/*
*
* EJERCICIO 1
* dado un dia de la semana muestra la asignatura que toca a primera hora
*
*/

public class Ejercicio1 {
  public static void main(String[] args) {
  
	System.out.print("Introduzce un día de la semana: ");
    String dia = System.console().readLine();

	switch (dia) {

		case "Lunes":
		
			System.out.print("a primera hora toca EED");
			break;
		
		case "Martes":
		
			System.out.print("a primera hora toca SINF");
			break;
		
		case "Miércoles":
		
			System.out.print("a primera hora toca PRO");
			break;
		
		case "Jueves":
		
			System.out.print("a primera hora toca PRO");
			break;
		
		case "Viernes":
		
			System.out.print("a primera hora toca SINF");
			break;
		
		default:
		
			System.out.print("Introduzca un día de la semana por favor");
	}
  }
}
