/*
*
* EJERCICIO 4
* De 20 números aleatorios muestra el número, su cuadrado y su cubo
*
*/

public class Ejercicio4 {
  public static void main(String[] args) {
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    for (int i = 0; i < 20; i++) {
      
      numero[i] = (int)(Math.random() * 100);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = numero[i] * numero[i] * numero[i];
      
      System.out.printf("%-7d %-7d %-7d\n", numero[i], cuadrado[i], cubo[i]);
    }
  }
}
