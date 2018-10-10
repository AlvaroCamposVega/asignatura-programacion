/*
*
* EJERCICIO 11
* Muestra en tres columnas el cuadrado y el cubo de los 5 primeros números
* enteros a partir de uno introducido
*
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int eliminar = 10000;
    int ultimoNumero = 0;
    int cuad = 0;
    int cubo = 0;
    
    for (int i = 0; i <= 4; i++) {
      
      ultimoNumero = (numero / eliminar) % 10;
      cuad = ultimoNumero * ultimoNumero;
      cubo = ultimoNumero * ultimoNumero * ultimoNumero;
      
      eliminar /= 10;
      
      System.out.printf("num: %-8d cuadrado: %-8d cubo: %-8d\n", ultimoNumero, cuad, cubo);
    }
  }
}
