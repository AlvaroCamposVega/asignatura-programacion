package Tema_5;

/*
*
* EJERCICIO 5
* Muestra los números del 320 al 160 contando de 20 en 20 hacia atrás con while
*
*/

public class Ejercicio5 {
  public static void main(String[] args) {
  
    int i = 320;
    
    while (i >= 160) {
      
      System.out.println(i);
      i -= 20;
    }
  }
}
