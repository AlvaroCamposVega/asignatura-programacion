package Tema_5;

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
    
    int cifra = 1;
    int digitos = 0;
    
    do {
      
      cifra *= 10;
      digitos++;
      
    } while (numero >= cifra);
    
    int eliminar = cifra / 10;
    int ultimoNumero = 0;
    int cuad = 0;
    int cubo = 0;
    
    for (int i = 0; i < digitos; i++) {
      
      ultimoNumero = (numero / eliminar) % 10;
      cuad = ultimoNumero * ultimoNumero;
      cubo = ultimoNumero * ultimoNumero * ultimoNumero;
      
      eliminar /= 10;
      
      System.out.printf("num: %-8d cuadrado: %-8d cubo: %-8d\n", ultimoNumero, cuad, cubo);
    }
  }
}
