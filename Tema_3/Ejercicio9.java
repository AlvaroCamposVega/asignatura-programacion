/*
*
* EJERCICIO 9
* calcula el volumen de un cono según la fórmula
*
*/

public class Ejercicio9 {
  public static void main(String[] args) {
  
	System.out.print("Introduzca radio del cono: ");
    double radio = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la altura: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    double volumen = (Math.PI * (radio * radio) * altura) / 3;
    
    System.out.println("El volumen equivale a: " + volumen);
  }
}
