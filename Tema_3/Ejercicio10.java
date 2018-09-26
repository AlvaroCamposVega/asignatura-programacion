/*
*
* EJERCICIO 10
* conversor de Mb a Kb
*
*/

public class Ejercicio10 {
  public static void main(String[] args) {
  
	System.out.print("Introduzca los Mb que desea convertir: ");
    int megaB = Integer.parseInt(System.console().readLine());

    
    int conversion = 1000;
    
    int kiloB = (megaB * conversion);
    System.out.println(megaB + " Mb son " + kiloB + " Kb");
  }
}
