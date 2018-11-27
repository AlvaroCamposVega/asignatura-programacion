package Tema_7.ArraysBidimensionales;

/*
*
* EJERCICIO 6
* Modifica el programa anterior de tal forma que no se repita ningún número en
* el array
*
*/

public class Ejercicio6 {
  public static void main(String[] args){
    
    int num[][] = new int[6][10];
    
    System.out.println("Se van a generar 20 números aleatorios:\n");
    
    for (int fila = 0; fila < 6; fila++) { // Introducir datos
      
      for (int columna = 0; columna < 10; columna++) {
        
        int numero = (int)(Math.random() * 1000);
        
        num[fila][columna] = numero;
      }
    }
    
    boolean repetirBucle = false;
    boolean numRepetido = false;
    
    do {
      
      repetirBucle = false;
      
      for (int fila = 0; fila < 6; fila++) { // Comprobar repeticiones en array
      
        for (int columna = 0; columna < 10; columna++) { // Miramos cada dato
          
          int numero = num[fila][columna]; // Dato
          
          // COMPROBAMOS QUE NO ESTÁ REPETIDO
          for (int fila2 = 0; fila2 < 6; fila2++) {
            
            // CON LOS DEMÁS DATOS
            for (int columna2 = 0; columna2 < 10; columna2++) {
              
              if ((num[fila2][columna2] == numero) && (columna2 != columna) && (fila != fila2)) {
                
                repetirBucle = true;
                numRepetido = true;
              }
            }
          }
          
          if (numRepetido) {
            
            num[fila][columna] = (int)(Math.random() * 1001);
            numRepetido = false;
          }
        }
      }
      
    } while (repetirBucle);
    
    int minimo = num[0][0];
    int maximo = num[0][0];
    
    int filMax = 0;
    int colMax = 0;
    int filMin = 0;
    int colMin = 0;
    
    for (int fila = 0; fila < 6; fila++) { // Encontrar máximo y mínimo
      
      for (int columna = 0; columna < 10; columna++) {
        
        if (num[fila][columna] > maximo) {
          
          maximo = num[fila][columna];
          filMax = fila + 1;
          colMax = columna + 1;
        }
        
        if (num[fila][columna] < minimo) {
          
          minimo = num[fila][columna];
          filMin = fila + 1;
          colMin = columna + 1;
        }
      }
    }
    
    for (int fila = 0; fila < 6; fila++) { // Pintar array y mostrar maximo y minimo
      
      for (int columna = 0; columna < 10; columna++) {
        
        if (num[fila][columna] == minimo || num[fila][columna] == maximo) {
          
          System.out.printf("%-7s", "\"" + num[fila][columna] + "\"");
          
        } else {
          
          System.out.printf("%-7d", num[fila][columna]);
        }
      }
      
      System.out.println();
    }
    
    System.out.println("\nEl máximo está en la fila " + filMax + " y en la columna " + colMax);
    System.out.print("El mínimo está en la fila " + filMin + " y en la columna " + colMin);
  }
}
