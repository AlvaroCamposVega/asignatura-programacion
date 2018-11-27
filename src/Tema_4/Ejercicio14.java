package Tema_4;

/*
*
* EJERCICIO 14
* calcula si un número es par y divisible entre 5
*
*/

public class Ejercicio14 {
  public static void main(String[] args) {
  
    System.out.print("Introduce un número entero: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int par = num % 2;
    int diviCinco = num % 5;
    
    if (par == 0) {
      
      System.out.print(num + " es par");
      
    } else {
      
      System.out.print(num + " no es par");
    }
    
    if (diviCinco == 0) {
      
      System.out.print(" y es divisible entre 5");
      
    } else {
      
      System.out.print(" y no es divisible entre 5");
    }
  }
}
