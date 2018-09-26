/*
*
* EJERCICIO 6
* calcula el area de un triangulo
*
*/

public class Ejercicio6 {
  public static void main(String[] args) {
  
	System.out.print("Introduzca lado A: ");
    int lado1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca lado B: ");
    int lado2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la altura: ");
    int altura = Integer.parseInt(System.console().readLine());

	int area = ((base * altura) / 2);
    System.out.println("El área del triángulo es " + area);
  }
}
