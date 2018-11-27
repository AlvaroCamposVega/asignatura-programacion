package Tema_5;

/*
*
* EJERCICIO 23
* Introduce números hasta que supere el valor de 10000 y muestra el total, la
* cuenta y le media
*
*/

public class Ejercicio23 {
  public static void main(String[] args) {

    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000\n");
    
    int numero;
    int suma = 0;
    int cuenta = 0;
    
    do {
      System.out.print("Introduce número ");
      numero = Integer.parseInt(System.console().readLine());
      suma += numero;
      cuenta++;
      
    } while (suma <= 10000);
    
    int media = suma / cuenta;
    
    System.out.println("\nHas introducido " + cuenta + " números");
    System.out.println("La suma total es " + suma);
    System.out.println("La media es " + media);
  }
}
