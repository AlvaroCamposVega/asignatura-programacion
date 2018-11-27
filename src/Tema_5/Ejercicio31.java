package Tema_5;

/*
*
* EJERCICIO 31
* pinta la letra L con asteriscos dada la altura
*
*/

public class Ejercicio31 {
  public static void main(String[] args) {
    
    System.out.print("Introduce la altura de la L: ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    int paloHor = (altura / 2) + 1;
    
    for (int i = 1; i < altura; i++) {
      
      System.out.println("*");
      
      if (i == (altura - 1)) {
        
        for (int j = 0; j < paloHor; j++) {
          
          System.out.print("* ");
        }
      }
    }
  }
}
