/*
*
* EJERCICIO 4
* calcula el salario semanal de un trabajador teniendo en cuenta las horas extra
* a partir de las 40 horas
*
*/

public class Ejercicio4 {
  public static void main(String[] args) {
	
	System.out.print("Introduzca las horas trabajadas durante la semana: ");
    int horas = Integer.parseInt(System.console().readLine());

	int horasExtra = (horas - 40);
	
	if (horas <= 40 && horas > 0) {
		
		int salario = horas * 12;
		System.out.print("El sueldo semanal de este trabajador es de ");
		System.out.print(salario + " euros");
		
	} else if (horas >= 41) {
		
		int salario = (horas * 12) + (horasExtra * 16);
		System.out.print("El sueldo semanal de este trabajador es de ");
		System.out.print(salario + " euros");
		
	} else {
		
		System.out.print("Introduzca una cantidad de horas válida!");
	}
  }
}
