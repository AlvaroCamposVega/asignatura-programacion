/*
*
* EJERCICIO 20
* Dice si un número entero de máximo 5 cifras es capicúa
*
*/

public class Ejercicio20 {
  public static void main(String[] args) {
  
    System.out.print("Intoduce un número entero positivo de 5 cifras máximo: ");
    int num = Integer.parseInt(System.console().readLine());

    if (num < 10) { // Si tiene 1 cifra
      
      System.out.print("El número es " + num + ", no puede ser capicúa");
        
    } else if (num >= 10 && num < 100) { // Si tiene 2 cifras
        
      int cifra1 = num / 10; // Primera cifra
      int cifra2 = num % 10; // Segunda cifra
      
      if (cifra1 == cifra2) { // Comprobamos si es capicúa
        
        System.out.print("El número " + num + " es capicúa");
        
      } else {
        
        System.out.print("El número " + num + " no es capicúa");
      }
        
    } else if (num >= 100 && num < 1000) { // Si tiene 3 cifras
        
      System.out.print("El número es " + num + ", no puede ser capicúa");
        
    } else if (num >= 1000 && num < 10000) { // Si tiene 4 cifras
      
      int par1 = num / 100; // Las dos primeras cifras
      
      int cifra1 = par1 / 10; // Primera cifra del primer par
      int cifra2 = par1 % 10; // Segunda cifra del primer par
      
      int par2 = num % 100; // Las dos últimas cifras
      
      int cifra3 = par2 / 10; // Primera cifra del segundo par
      int cifra4 = par2 % 10; // Segunda cifra del segundo par
      
      if (cifra1 == cifra4 && cifra2 == cifra3) {
        
        System.out.print("El número " + num + " es capicúa");
        
      } else {
        
        System.out.print("El número " + num + " no es capicúa");
      }
        
    } else if (num >= 10000 && num < 100000) { // Si tiene 5 cifras
        
      System.out.print("El número es " + num + ", no puede ser capicúa");
        
    } else { // Si tiene más de 6 cifras
        
      System.out.print("El número debe tener un máximo de 5 cifras");
    }
  }
}
