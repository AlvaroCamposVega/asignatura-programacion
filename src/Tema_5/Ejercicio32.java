package Tema_5;

/*
*
* EJERCICIO 32
* pinta la letra U con asteriscos dada la altura
*
*/

public class Ejercicio32 {
  public static void main(String[] args) {
    
    System.out.print("Introduce la altura de la U: ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    int base = altura - 2;
    
    for (int i = 1; i < altura; i++) { // Bucle que hace los laterales
      
      System.out.print("*");
      
      for (int k = 0; k < base; k++) { // Pinta los espacios entre los laterales
        
        System.out.print(" ");
      }
      
      System.out.println("*");
      
      if (i == (altura - 1)) {
        
        System.out.print(" ");
        
        for (int j = 0; j < base; j++) {
          
          System.out.print("*");
        }
      }
    }
  }
}
