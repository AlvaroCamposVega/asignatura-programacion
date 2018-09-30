/*
*
* EJERCICIO 4
* muestra el salario de un trabajador que cobra 12 euros las 40 primeras
* horas y 16 euros las siguientes
*
*/

public class Ejercicio4 {
  public static void main(String[] args) {
  
	System.out.print("Introduzca las horas trabajadas esta semana: ");
    int horas = Integer.parseInt(System.console().readLine());

	if (horas >= 0 && horas <= 40) {
		
		int salario = (horas * 12);
		System.out.print("Su sueldo semanal es de " + salario + " euros");
		
	} else if (horas >= 41) {
		
		int horasExtra = (horas - 40);
		int salario = ((40 * 12) + (horasExtra * 16));
		System.out.print("Su sueldo semanal es de " + salario + " euros");
		
	} else {
		
		System.out.print("Introduzca una cantidad válida por favor");
	}
  }
}
