package Tema_6;

/*
*
* EJERCICIO 12
* LLena la pantalla de carácteres aleatorios (a lo Matrix).
*
*/

public class Ejercicio12 {
  public static void main(String[] args) throws InterruptedException {

    int linea = 0;
      
    System.out.print("\033[32m"); // pinta en verde
      
    for(int i = 0; i < 8000; i++) {
      
      System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
        
      if (linea++ == 60) {
        
        linea = 0;
        Thread.sleep(50);
        System.out.println();
      }
    }
  }
}
