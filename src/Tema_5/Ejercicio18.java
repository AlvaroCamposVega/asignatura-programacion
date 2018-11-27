package Tema_5;

/*
*
* EJERCICIO 18
* Obtiene los números enteros comprendidos entre dos números distintos
* incrementando de 7 en 7
*
*/

public class Ejercicio18 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número positivo: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduce otro: ");
    int numero2 = Integer.parseInt(System.console().readLine());
    
    if (numero1 == numero2) {
      
      System.out.print("Introduce dos números distintos por favor");
      
    } else {
      
      int menor = 0;
      int mayor = 0;
      
      if (numero1 < numero2) {
        
        mayor = numero2;
        menor = numero1;
        
      } else {
        
        mayor = numero1;
        menor = numero2;
      }
      
      for (int i = menor; i < mayor; i++) {
        
        if (i != menor) {
          
          System.out.print(i + " ");          
        }
        
        i += 6;
      }
    }
  }
}
