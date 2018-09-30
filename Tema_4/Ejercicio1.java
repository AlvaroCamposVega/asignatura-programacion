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

	if (dia.equals("Lunes")) {
		
		System.out.print("a primera hora toca EED");
		
	} else if (dia.equals("Martes")) {
		
		System.out.print("a primera hora toca SINF");
		
	} else if (dia.equals("Miércoles")) {
		
		System.out.print("a primera hora toca PRO");
		
	} else if (dia.equals("Jueves")) {
		
		System.out.print("a primera hora toca PRO");
		
	} else if (dia.equals("Viernes")) {
		
		System.out.print("a primera hora toca SINF");
		
	} else {
		
		System.out.print("Introduzca un día de la semana por favor");
	}
  }
}
