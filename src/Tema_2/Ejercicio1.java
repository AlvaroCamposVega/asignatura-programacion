package Tema_2;

/*
*
* EJERCICIO 1
* muestra el valor, la suma, resta, división y multiplicación de dos variables
*
*/

public class Ejercicio1 {
  public static void main(String[] args) {
  
    int x = 144;
    int y = 999;
    int suma = x + y;
    int resta = x - y;
    int division = x / y;
    int multiplicacion = x * y;
    
    System.out.print("La variable x vale " + x);
    System.out.println(" y la variable y vale " + y);
    System.out.println("la suma de las dos es " + suma);
    System.out.println("la resta de las dos es " + resta);
    System.out.println("la división de las dos es " + division);
    System.out.println("la multiplicación de las dos es " + multiplicacion);
  }
}
