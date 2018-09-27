/*
*
* EJERCICIO 2
* convierte euros a pesetas
*
*/

public class Ejercicio2 {
  public static void main(String[] args) {

	double pesetas = 166.386;
  
	System.out.print("Introduzca los euros que desea convertir: ");
    double euros = Double.parseDouble(System.console().readLine());

    int conversion = (int)(euros * pesetas);
    System.out.print("Conversión realizada, usted recibe ");
    System.out.println(conversion + " pesetas");
  }
}
