package Tema_5;

/*
*
* EJERCICIO 13
* Determina cuántos números son positivos o negativos de una lista
*
*/

public class Ejercicio13 {
  public static void main(String[] args) {
    
    System.out.println("A continuación se le van a pedir 10 números enteros");
    
    int i = 0;
    int negativo = 0;
    int positivo = 0;
    
    while (i < 10) {
    
      System.out.print("Introduce un número: ");
      int numero = Integer.parseInt(System.console().readLine());
      
      if (numero < 0) {
        
        negativo++;
        
      } else {
        
        positivo++;
      }
      
      i++;
    }
    
    System.out.print("Había " + positivo + " números positivos y " + negativo + " números negativos");
  }
}
