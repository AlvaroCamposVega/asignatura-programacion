/*
*
* EJERCICIO 5
* resuelve ecuaciones de primer grado del tipo ax + b = 0
*
*/

public class Ejercicio5 {
  public static void main(String[] args) {
  
	System.out.print("Este programa resuelve ecuaciones de primer grado del ");
	System.out.println("tipo ax + b = 0");
	
	System.out.print("Introduce el valor de a: ");
    double valorA = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el valor de b: ");
    double valorB = Double.parseDouble(System.console().readLine());
	
	if (valorA == 0) {
	
		System.out.print("Esa ecuación no tiene solución real");
	
	} else {
		
		double resultado = (0 - valorB) / valorA;
		System.out.print("x = " + resultado);
	}
  }
}
