/*
*
* EJERCICIO 21
* dice cuantos números se han introducido. hace la media de los impares y el
* mayor de los pares
*
*/

public class Ejercicio21 {
  public static void main(String[] args) {
    
    int cuenta = 0;
    int mediaImpares = 0;
    int impares = 0;
    int mayor = 0;
    int numero = 0;
    
    while (numero >= 0) {
      
      System.out.print("Introduce un número entero: ");
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero > 0) { // No queremos hacer nada si el número es negativo
      
        if ((numero % 2) != 0) { // Si es impar
          
          impares ++;
          mediaImpares += numero;
        
        } else { // Si es par
          
          if (numero > mayor) {
            
            mayor = numero;
          }
        }
        
        cuenta++;
      }
    }
    
    System.out.println("Se han introducido " + cuenta + " números");
    
    if (impares > 1) {
    
      int media = mediaImpares / impares;
      System.out.println("La media de los números impares introducidos es " + media);
      
    } else {
      
      System.out.println("No se puede hacer la media con menos de 2 números ");
    }
    
    if (mayor > 0) {
      
      System.out.print("El número par más grande es " + mayor);
    
    } else {
      
      System.out.print("No se ha introducido ningún número par");
    }
  }
}
