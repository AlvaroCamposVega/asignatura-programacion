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
    double valorA = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el valor de b: ");
    double valorB = Integer.parseInt(System.console().readLine());

	double resultado = (0 - valorB) / valorA;
	
	System.out.print("x =  " + resultado);
  }
}