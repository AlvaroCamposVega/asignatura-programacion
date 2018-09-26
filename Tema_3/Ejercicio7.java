/*
*
* EJERCICIO 7
* calcula el total de una factura dada la base imponible
*
*/

public class Ejercicio7 {
  public static void main(String[] args) {
  
	System.out.print("Introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    double IVA = ((baseImponible * 21) / 100);
    double precioTotal = (baseImponible + IVA);
    
    System.out.println("IVA: " + IVA);
    System.out.println("Precio Total: " + precioTotal);
  }
}
