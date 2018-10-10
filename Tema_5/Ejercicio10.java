/*
*
* EJERCICIO 10
* Calcula la media de un conjunto de números positivos
*
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    
    int cuenta = 0;
    int suma = 0;
    int numero = 0;
    
    while (numero >= 0) {
      
      System.out.print("Introduce un número entero: ");
      numero = Integer.parseInt(System.console().readLine());
      
      cuenta++;
      suma += numero;
    }
    
    cuenta -= 1;
    suma -= numero;
    int media = suma / cuenta;
    
    System.out.print("La media de los números introducidos es " + media);
  }
}
