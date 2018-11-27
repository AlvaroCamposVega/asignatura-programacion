package Tema_6;

/*
*
* EJERCICIO 13
* Simula una tirada de dados. Continúa tirando dados hasta que los dos sean
* iguales.
*
*/

public class Ejercicio13 {
  public static void main(String[] args) {

    int dado1 = 0;
    int dado2 = 0;
    
    do {
      
      dado1 = (int)(Math.random() * 6) + 1;
      dado2 = (int)(Math.random() * 6) + 1;
      
      System.out.println("Dado 1: " + dado1);
      System.out.println("Dado 2: " + dado2 + "\n------------------\n");
      
    } while (dado1 != dado2);
  }
}
