/*
*
* EJERCICIO 17
* Dice cuál es la última cifra de un número entero
*
*/

public class Ejercicio17 {
  public static void main(String[] args) {
  
    System.out.print("Intoduce un número entero: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int ultimaCifra = num % 10;
    
    System.out.print("La última cifra es: " + ultimaCifra);
  }
}
