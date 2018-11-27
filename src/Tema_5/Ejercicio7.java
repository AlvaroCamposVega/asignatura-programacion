package Tema_5;

/*
*
* EJERCICIO 7
* Realiza el control de acceso a una caja fuerte
*
*/

public class Ejercicio7 {
  public static void main(String[] args) {
  
    int intentos = 4;
    
    while (intentos > 0) {
      
      System.out.print("Introduce la combinación de 4 cifras: ");
      int numero = Integer.parseInt(System.console().readLine());
      
      int combinacion = 1234;
      
      if (numero == combinacion) {
        
        System.out.print("La caja fuerte se ha abierto satisfactoriamente");
        break;
        
      } else {
        
        System.out.println("Lo siento, esa no es la combinación");
        intentos--;
      }
    }
    
    if (intentos == 0) {
    
      System.out.print("Has fallado 4 veces, no tienes más oportunidades");
    }
  }
}
