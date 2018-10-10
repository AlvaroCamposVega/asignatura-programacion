/*
*
* EJERCICIO 9
* Muestra cuántos dígitos tiene un número
*
*/

public class Ejercicio9 {
  public static void main(String[] args) {
  
    System.out.print("Introduce un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int cifra = 1;
    int digitos = 0;
    
    do {
      
      cifra *= 10;
      digitos++;
      
    } while (numero >= cifra);
    
    System.out.print("El número " + numero + " tiene " + digitos + " digitos");
  }
}
