package Tema_3;

/*
*
* EJERCICIO 1
* pide dos números y los multiplica
*
*/

public class Ejercicio1 {
  public static void main(String[] args) {

	System.out.print("Introduce un número entero: ");
    int num1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce otro número entero: ");
    int num2 = Integer.parseInt(System.console().readLine());
    
    int multi = num1 * num2;
    System.out.print("Resultado de multiplicarlos: " + multi);
  }
}
