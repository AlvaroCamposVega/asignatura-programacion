/*
*
* EJERCICIO 29
* Muestra todos los números positivos menores a uno introducido que no sean
* divisibles entre otro introducido
*
*/

public class Ejercicio29 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero positivo grande: ");
    int numeroG = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca otro número pequeño: ");
    int numeroP = Integer.parseInt(System.console().readLine());

    System.out.print("Los números enteros positivos menores que " + numeroG);
    System.out.println(" que no son divisibles entre " + numeroP + " son: ");

    int cuenta = 0;
    int suma = 0;

    for (int i = 1; i < numeroG; i++) {
      
      if ((i % numeroP) != 0) {
        
        System.out.print(i + " ");
      }
    }
  }
}
