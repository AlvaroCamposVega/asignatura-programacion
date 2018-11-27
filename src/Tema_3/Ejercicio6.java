package Tema_3;

/*
*
* EJERCICIO 6
* calcula el area de un triangulo
*
*/

public class Ejercicio6 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca la base en cm: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la altura en cm: ");
    int altura = Integer.parseInt(System.console().readLine());

	int area = ((base * altura) / 2);
    System.out.println("El área del triángulo es " + area + " cm2");
  }
}
