/*
*
* EJERCICIO 8
* Muestra la tabla de multiplicar de un número
*
*/

public class Ejercicio8 {
  public static void main(String[] args) {
  
    System.out.print("Introduce un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i <= 10; i++) {
      
      int multiplicacion = numero * i;
      System.out.println(numero + " x " + i + " = " + multiplicacion);
    }
  }
}
