/*
*
* EJERCICIO 18
* Dice cuál es la primera cifra de unum número entero, máximo 5 cifras
*
*/

public class Ejercicio18 {
  public static void main(String[] args) {
  
    System.out.print("Intoduce un número entero positivo de 5 cifras máximo: ");
    int num = Integer.parseInt(System.console().readLine());
    int primerDig = 0;
    
    if (num >= 100000) {
      
      System.out.print("El número debe tener un máximo de 5 cifras");
      
    } else {

      if (num < 10) {
      
        primerDig = num;
      }
    
      if (num >= 10 && num < 100) {
        
        primerDig = num / 10;
      }
    
      if (num >= 100 && num < 1000) {
        
        primerDig = num / 100;
      }
      
      if (num >= 1000 && num < 10000) {
        
        primerDig = num / 1000;
      }
      
      if (num >= 10000 && num < 100000) {
        
        primerDig = num / 10000;
      }
      
      System.out.print("La primera cifra es: " + primerDig);
    }
  }
}
