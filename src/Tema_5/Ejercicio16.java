package Tema_5;

/*
*
* EJERCICIO 16
* Dice si un número es primo o no
*
*/

public class Ejercicio16 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int i = 2;
    boolean primo = true;
    
    while (i < numero) {
      
      if ((numero % i) == 0) {
        
        primo = false;
      }
      
      i++;
    }
        
    if (primo) {
      
      System.out.println("El número " + numero + " es primo");
      
    } else {
      
      System.out.println("El número " + numero + " no es primo");
    }
  }
}
