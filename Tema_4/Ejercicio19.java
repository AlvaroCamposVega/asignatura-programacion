/*
*
* EJERCICIO 19
* Dice cuántos dígitos tiene un número entero de un máximo de 5 cifras
*
*/

public class Ejercicio19 {
  public static void main(String[] args) {
  
    System.out.print("Intoduce un número entero de 5 cifras máximo: ");
    int num = Integer.parseInt(System.console().readLine());
    int cifras = 0;
    
    if (num >= 100000 || num <= -100000) {
      
      System.out.print("El número debe tener un máximo de 5 cifras");
      
    } else {

      if (num < 10 && num > (-10)) {
      
        cifras = 1;
        
      } else if (num < 100 && num > (-100)) {
        
        cifras = 2;
        
      } else if (num < 1000 && num > (-1000)) {
        
        cifras = 3;
        
      } else if (num < 10000 && num > (-10000)) {
        
        cifras = 4;
        
      } else if (num < 100000 && num > (-100000)) {
        
        cifras = 5;
      }
      
      System.out.print("El número introducido tiene " + cifras + " cifras");
    }
  }
}
