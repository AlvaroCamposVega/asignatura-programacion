package Tema_6;

/*
*
* EJERCICIO 4
* Muestra 20 numeros aleatorios entre 0 y 10 ambos incluidos
*
*/

public class Ejercicio4 {
  public static void main(String[] args) {
    
    for (int i = 1; i <= 20; i++) { 
      
      int numAleatorio = (int)(Math.random() * 11);
      System.out.print(numAleatorio + " ");
    }
  }
}
