package Tema_6;

/*
*
* EJERCICIO 5
* Muestra 50 números aleatorios entre 100 y 199 ambos incluidos, muestra también
* el máximo, el mínimo y la media de esos números
*
*/

public class Ejercicio5 {
  public static void main(String[] args) {
    
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int numero;
    
    for (int i = 0; i < 50; i++) {
      
      numero = (int)(Math.random() * 100) + 100;
      System.out.print(numero + " ");
      suma += numero;
      
      if (numero < minimo) {
        
        minimo = numero;
      }
      
      if (numero > maximo) {
        
        maximo = numero;
      }
    }
    
    int media = suma / 50;
    
    System.out.println("\nMínimo: " + minimo + "\nMáximo: " + maximo + "\nMedia: " + media);
  }
}
