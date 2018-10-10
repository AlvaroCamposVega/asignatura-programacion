/*
*
* EJERCICIO 14
* Calcula la potencia dada la base y el exponente
*
*/

public class Ejercicio14 {
  public static void main(String[] args) {
    
    System.out.print("Introduce una base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora un exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    int i = 1;
    
    while (i < exponente) {
    
      base *= base;
      i++;
    }
    
    System.out.print("La potencia es: " + base);
  }
}
