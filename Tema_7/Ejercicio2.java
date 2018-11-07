/*
*
* EJERCICIO 2
* Muestra el contenido de todos los elementos de un array
*
*/

public class Ejercicio2 {
  public static void main(String[] args) {
    
    char[] simbolo = new char[10];
    simbolo[0] = 'a';
    simbolo[1] = 'X';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    
    for (int i = 0; i < 10; i++) {
      
      System.out.println(simbolo[i]);
    }
  }
}
