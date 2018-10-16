/*
*
* EJERCICIO 27
* Muestra, cuenta y suma los múltiplos de 3 que hay entre 1 y n
*
*/

public class Ejercicio27 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero mayor que 1: ");
    int numero = Integer.parseInt(System.console().readLine());

    int cuenta = 0;
    int suma = 0;
    int i;
    
    System.out.print("\nMúltiplos: ");
    
    for (i = 1; i < numero; i++) {
      
      if ((i % 3) == 0) {
        
        System.out.print(i + " ");
        cuenta++;
        suma += i;
      }
    }
    
    System.out.print("\nDesde 1 hasta " + numero + " hay " + cuenta);
    System.out.println(" múltiplos de 3 y suman " + suma);
  }
}
