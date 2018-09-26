/*
*
* EJERCICIO 5
* calcula el area de un rectangulo
*
*/

public class Ejercicio5 {
  public static void main(String[] args) {
  
	System.out.print("Introduzca la altura del rectángulo: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());

	int area = (altura * base);
    System.out.println("El área del rectángulo es " + area);
  }
}
