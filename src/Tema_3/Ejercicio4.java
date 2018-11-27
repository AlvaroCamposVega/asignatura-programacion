package Tema_3;

/*
*
* EJERCICIO 4
* muestra la suma, resta, división y multiplicación de dos números
*
*/

public class Ejercicio4 {
  public static void main(String[] args) {
  
	System.out.print("Introduzca un número entero: ");
    int num1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca otro número entero: ");
    int num2 = Integer.parseInt(System.console().readLine());

	int suma = num1 + num2;
    System.out.println("la suma de los dos números es " + suma);
    
	int resta = num1 - num2;
    System.out.println("la resta de los dos números es " + resta);
    
    int division = num1 / num2;
    System.out.println("la división de los dos numeros es " + division);
    
    int multiplicacion = num1 * num2;
    System.out.print("la multiplicación de los dos números es ");
    System.out.print(multiplicacion);
  }
}
