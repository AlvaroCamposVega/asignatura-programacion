/*
*
* EJERCICIO 6
* calcula el total de una factura dada la base imponible
*
*/

public class Ejercicio6 {
  public static void main(String[] args) {
  
    int baseImponible = 550;
    double IVA = ((baseImponible * 21) / 100);
    double precioTotal = (baseImponible + IVA);
    
    System.out.println("Base imponible: " + baseImponible);
    System.out.println("IVA: " + IVA);
    System.out.println("Precio Total: " + precioTotal);
  }
}
