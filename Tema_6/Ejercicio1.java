/*
*
* EJERCICIO 1
* Muestra la tirada de tres dados
*
*/

public class Ejercicio1 {
  public static void main(String[] args) {
    
    int dado;
    int sumaPuntos = 0;
    
    for (int i = 1; i <= 3; i++) {
      
      dado = (int)(Math.random() * 6) + 1;
      sumaPuntos += dado;
      
      System.out.println("Dado " + i + ": " + dado);
    }
    
    System.out.print("\nSuma de los puntos: " + sumaPuntos);
  }
}
