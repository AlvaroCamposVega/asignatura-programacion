/*
*
* EJERCICIO 15
* Muestra por pantalla todas las potencias con base dada y exponentes entre 1
* y el exponente dado
*
*/

public class Ejercicio15 {
  public static void main(String[] args) {
    
    System.out.print("Introduce una base real: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Ahora un exponente entero: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    int i = 1;
    double potencia = base;
    
    while (i <= exponente) {
      
      System.out.println(base + "^" + i + " = " + potencia);
      potencia *= base;
      i++;
    }
  }
}
