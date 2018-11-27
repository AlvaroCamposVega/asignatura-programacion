package Tema_7.ArraysBidimensionales;

/*
*
* EJERCICIO 2
* Escribe un programa que pida 20 números enteros. Estos números se deben
* introducir en un array de 4 filas por 5 columnas. El programa mostrará las
* sumas parciales de filas y columnas igual que si de una hoja de cálculo se
* tratara. La suma total debe aparecer en la esquina inferior derecha
*
*/

public class Ejercicio2 {
  public static void main(String[] args){
    
    int num[][] = new int[5][6];
    int contador = 1;
    
    System.out.println("Introduzca 20 números para rellenar el array:\n");
    
    for (int fila = 0; fila < 4; fila++) { // Introducir datos
      
      for (int columna = 0; columna < 5; columna++) {
        
        System.out.print("Número " + contador + ": ");
        int numero = Integer.parseInt(System.console().readLine());
        
        num[fila][columna] = numero;
        
        contador++;
      }
    }
    
    for (int fila = 0; fila < 4; fila++) { // Sumatorio filas
      
      int sumFila = 0;
      
      for (int columna = 0; columna < 6; columna++) {
        
        sumFila += num[fila][columna];
      }
      
      num[fila][5] = sumFila;
    }
    
    for (int columna = 0; columna < 5; columna++) { // Sumatorio columnas
      
      int sumColumna = 0;
      
      for (int fila = 0; fila < 4; fila++) {
        
        sumColumna += num[fila][columna];
      }
      
      num[4][columna] = sumColumna;
    }
    
    int total = 0;
    
    for (int fila = 0; fila < 4; fila++) { // total
      
      total += num[fila][5];
    }
    
    num[4][5] = total;
    
    System.out.println("\n----------------------------------------------");
    
    for (int fila = 0; fila < 5; fila++) { // Pintar array
      
      for (int columna = 0; columna < 6; columna++) { // En cada casilla pinta
        
        /*if (columna == 0) {
          
          System.out.print("   ");
        }*/
        
        if (columna == 4) { // Pinta la barra divisora del sumatorio de la fila
        
          System.out.printf("%-4d %-4s", num[fila][columna], "|");
          
        } else if (columna == 5) { // Pinta Sumatorio de la fila o el total
          
          if (fila < 4) { // Sumatorio fila si la fila no es la última
          
            System.out.printf("%-5d %-9s", num[fila][columna], "SumFila " + fila);
          
          } else { // Sumatorio total en la última fila
            
            System.out.printf("%-5d %-8s", num[fila][columna], "TOTAL\n");
          }
          
        } else { // Pinta las casillas del array
          
          System.out.printf("%-8d", num[fila][columna]);
        }
      }
      
      if (fila == 3) { // Pinta la barra divisora de los sumatorios inferiores
        
        System.out.print("\n----------------------------------------------");
      }
      
      /*if (fila == 4) {
        
        for (int columna = 0; columna < 5; columna++) {
        
          System.out.printf("%-9s", "SumCol " + columna);
        }
      }*/
      
      System.out.println();
    }
  }
}
