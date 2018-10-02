/*
*
* EJERCICIO 10
* muestra tu horoscopo dada tu fecha de nacimiento
*
*/

public class Ejercicio10 {
  public static void main(String[] args) {
	  
	System.out.println("Este programa te dice tu horóscopo");
	
	System.out.print("Introduce solo el día que naciste: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora el mes con palabras: ");
    String mes = System.console().readLine();
    System.out.println();
    
    // COMPROBACIONES
    if (dia <= 0 || dia > 31) {
		
		System.out.println("Introduce un día válido por favor");
		
	} else if ((dia >= 21 && mes.equals("Enero")) || dia <= 19 && mes.equals("Febrero")) {
			
		System.out.print("Tu horóscopo es acuario");
			
	} else if ((dia >= 20 && mes.equals("Febrero")) || dia <= 20 && mes.equals("Marzo")) {
			
		System.out.print("Tu horóscopo es piscis");
			
	} else if ((dia >= 23 && mes.equals("Junio")) || dia <= 23 && mes.equals("Julio")) {
			
		System.out.print("Tu horóscopo es cáncer");
			
	} else if ((dia >= 24 && mes.equals("Julio")) || dia <= 23 && mes.equals("Agosto")) {
			
		System.out.print("Tu horóscopo es leo");
			
	} else if ((dia >= 24 && mes.equals("Agosto")) || dia <= 23 && mes.equals("Septiembre")) {
			
		System.out.print("Tu horóscopo es virgo");
			
	} else if ((dia >= 24 && mes.equals("Septiembre")) || dia <= 23 && mes.equals("Octubre")) {
			
		System.out.print("Tu horóscopo es libra");
			
	} else if ((dia >= 24 && mes.equals("Octubre")) || dia <= 22 && mes.equals("Noviembre")) {
			
		System.out.print("Tu horóscopo es escorpio");
			
	} else if ((dia >= 23 && mes.equals("Noviembre")) || dia <= 21 && mes.equals("Diciembre")) {
			
		System.out.print("Tu horóscopo es sagitario");
			
	} else {
			
		System.out.print("Introduce un mes válido por favor");
	}
  }
}
