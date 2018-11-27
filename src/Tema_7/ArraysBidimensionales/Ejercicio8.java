package Tema_7.ArraysBidimensionales;

/*
*
* EJERCICIO 8
* Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
* a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
* indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
* 64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
* se indican del 1 al 8
*
*/

import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la posición del alfil: ");
    String posicion = s.nextLine();
    
    int alfilY = (int)(posicion.charAt(0)) - 96;
    int alfilX = (int)(posicion.charAt(1)) - 48;
    
    System.out.println("El alfil puede moverse a las siguiente posiciones: ");
    
    for (int fila = 8; fila >= 1; fila--) {
      
      for (int columna = 1; columna <= 8; columna++) {
        
        if ((Math.abs(alfilX - fila) == Math.abs(alfilY - columna))
            && (! ((alfilX == fila) && (alfilY == columna)))) {
          
            System.out.print((char)(columna + 96) + "" + fila + " ");
        }
      }
    }
  }
}
