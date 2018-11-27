package Tema_5;

/*
*
* EJERCICIO 17
* Suma los siguientes 100 números a un número entero positivo
*
*/

public class Ejercicio17 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero <= 0) {
      
      System.out.print("Introduce un número entero positivo por favor");
      
    } else {
      
      int suma = 0;
      
      for (int i = numero; i <= (numero + 100); i++) {
        
        suma += i;
      }
      
      System.out.print("suma: " + suma);
    }
  }
}
