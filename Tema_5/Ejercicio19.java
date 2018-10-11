/*
*
* EJERCICIO 19
* pinta una pirámide por pantalla
*
*/

public class Ejercicio19 {
  public static void main(String[] args) {
    
    System.out.print("Introduce la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el carácter con el que se rellenará: ");
    String c = System.console().readLine();
    System.out.print("\n");
    
    if (altura <= 1) {
      
      System.out.print("Introduzca una altura mayor que 1");
      
    } else {
      
      for (int i = 1; i <= altura; i++) {
        
        for (int k = altura; k > i; k--) {
          
          System.out.print(" ");
          
        }
        
        for (int j = 0; j < i; j++) {
          
          System.out.print(c);
          
        }
        
        System.out.println();
      }
    }
  }
}
