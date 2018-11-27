package Tema_5;

/*

 * Ejercicio 35
 * Pinta una X hecha de asteriscos dada la altura
 */

import java.util.Scanner;

public class Ejercicio35 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la X: ");
    int altura = Integer.parseInt(s.nextLine());
    
    if (altura < 3 || altura % 2 == 0) {
      
      System.out.print("Datos incorrectos, se debe introducir una ");
      System.out.print("altura impar y mayor o igual a 3 ");
      
    } else {
    
      int patas = altura / 2; // Define el largo de las mitades de la X
      
      String espaciosInternos = ""; // Almacena los espacios internos
      int espaciosIntLongitud = 0; // Almacena cuántos espacios internos hay
      
      String espacios = ""; // Almacena los espacios
      int espaciosLongitud = 0; // Almacena cuántos espacios hay
      
      for (int i = 1; i < (altura - 1); i++) { // Configurar espacios internos
        
        espaciosInternos += " ";
        espaciosIntLongitud ++;
      }
      
      for (int i = 0; i < patas; i++) { // Mitad superior de la X
        // Debemos parar una iteración antes para no pasarnos
        if (i < (patas - 1)) {
            
          espaciosIntLongitud -= 2;
        }
        // Vamos pintando la parte superior línea a línea
        System.out.print(espacios);
        System.out.print("*");
        System.out.print(espaciosInternos);
        System.out.print("*\n");
        // Acortamos los espacios internos y añadimos espacios
        espaciosInternos = espaciosInternos.substring(0, espaciosIntLongitud);
        espacios += " ";
        espaciosLongitud ++;
      }
        
      System.out.println(espacios + "*"); // Asterisco central
      
      for (int i = 0; i < patas; i++) { // Mitad inferior de la X
        // Acortamos espacios
        espaciosLongitud -= 1;      
        espacios = espacios.substring(0, espaciosLongitud);
        // Pintamos
        System.out.print(espacios);
        System.out.print("*");
        System.out.print(espaciosInternos);
        System.out.print("*\n");
        // Añadimos espacios internos
        espaciosInternos += " " + " ";
      }
    }
  }
}
