package Tema_7.ArraysUnaDimension;

/*
*
* EJERCICIO 5
* Muestra 10 números introducidos y dice cual es el máximo y el mínimo
*
*/

public class Ejercicio5 {
  public static void main(String[] args) {
    
    int[] numeros = new int[10];
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print("Introduce un número: ");
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("------------------------");
    
    int maximo = numeros[0];
    int minimo = numeros[0];
    
    for (int i = 0; i < 10; i++) {
      
      if (numeros[i] < minimo) {
        
        minimo = numeros[i];
      }
      
      if (numeros[i] > maximo) {
        
        maximo = numeros[i];
      }
    }
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print(numeros[i]);
      
      if (numeros[i] == minimo) {
        
        System.out.print(" minimo");
      }
      
      if (numeros[i] == maximo) {
        
        System.out.print(" maximo");
      }
      
      System.out.println();
    }
  }
}
