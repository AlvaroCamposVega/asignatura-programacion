/*
*
* EJERCICIO 5
* Realiza un programa que rellene un array de 6 filas por 10 columnas con
* números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
* A continuación, el programa deberá dar la posición tanto del máximo como
* del mínimo
*
*/

public class Ejercicio5 {
  public static void main(String[] args){
    
    int num[][] = new int[6][10];
    
    System.out.println("Se van a generar 20 números aleatorios:\n");
    
    for (int fila = 0; fila < 6; fila++) { // Introducir datos
      
      for (int columna = 0; columna < 10; columna++) {
        
        int numero = (int)(Math.random() * 1000);
        
        num[fila][columna] = numero;
      }
    }
    
    int minimo = num[0][0];
    int maximo = num[0][0];
    
    for (int fila = 0; fila < 6; fila++) { // Encontrar máximo y mínimo
      
      for (int columna = 0; columna < 10; columna++) {
        
        if (num[fila][columna] > maximo) {
          
          maximo = num[fila][columna];
        }
        
        if (num[fila][columna] < minimo) {
          
          minimo = num[fila][columna];
        }
      }
    }
    
    for (int fila = 0; fila < 6; fila++) { // Encontrar máximo y mínimo
      
      for (int columna = 0; columna < 10; columna++) {
        
        if (num[fila][columna] == minimo || num[fila][columna] == maximo) {
          
          System.out.printf("%-7s", "\"" + num[fila][columna] + "\"");
          
        } else {
          
          System.out.printf("%-7d", num[fila][columna]);
        }
      }
      
      System.out.println();
    }
  }
}
