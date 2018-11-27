package Tema_3;

/*
*
* EJERCICIO 11
* conversor de Kb a Mb
*
*/

public class Ejercicio11 {
  public static void main(String[] args) {
  
	System.out.print("Introduzca los Kb que desea convertir: ");
    int kiloB = Integer.parseInt(System.console().readLine());

    
    int conversion = 1000;
    
    int megaB = (kiloB / conversion);
    System.out.println(kiloB + " Kb son " + megaB + " Mb");
  }
}
