package Tema_3;

/*
*
* EJERCICIO 12
* calcula la nota que hace falta sacar en el segundo examen para
* conseguir la media deseada
*
*/

public class Ejercicio12 {
  public static void main(String[] args) {
  
	System.out.print("Introduzca la nota del primer examen: ");
    float ex1 = Float.parseFloat(System.console().readLine());
    
    System.out.print("¿Qué media deseas obtener en el trimestre? ");
    float media = Float.parseFloat(System.console().readLine());

    double ex2 = (double)((media - (ex1 * 0.4)) / 0.6);
    
    System.out.print("Para tener un " + media + " en el trimestre ");
    System.out.print("debes sacar un " + ex2 + " en el segundo examen");
  }
}
