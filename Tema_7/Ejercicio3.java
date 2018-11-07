/*
*
* EJERCICIO 3
* Lee 10 números por teclado y los muestra en orden inverso
*
*/

public class Ejercicio3 {
  public static void main(String[] args) {
    
    int[] numeros = new int[10];
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print("Introduce un número: ");
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("\nAhora están al revés: ");
    
    for (int i = 9; i >= 0; i--) {
      
      System.out.print(numeros[i] + " ");
    }
  }
}
