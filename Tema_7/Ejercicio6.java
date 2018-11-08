/*
*
* EJERCICIO 6
* Desplaza los elementos de un array 1 hacia la derecha
*
*/

public class Ejercicio6 {
  public static void main(String[] args) {
    
    int[] numeros = new int[15];
    
    for (int i = 0; i < 15; i++) {
      
      System.out.print("Introduce un número: ");
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("\nAhora están desplazados:");
    
    int auxiliar = numeros[14];
    int indice = 1;
    
    for (int i = 14; i >= 0; i--) {
      
      if (i > 0) {
        
        numeros[i] = numeros[14 - indice];
        indice++;
        
      } else {
      
        numeros[0] = auxiliar;
      }
    }
    
    for (int elemento : numeros) {
      
      System.out.print(elemento + " ");
    }
  }
}
