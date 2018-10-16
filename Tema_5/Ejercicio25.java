/*
*
* EJERCICIO 25
* pide un número por teclado y lo muestra del revés
*
*/

public class Ejercicio25 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero: ");
    int numeroUsuario = Integer.parseInt(System.console().readLine());

    int reves = 0;
    int numero = numeroUsuario;
    
    while (numero > 0) {
      
      reves = (reves * 10) + (numero % 10);
      numero /= 10;
      
    }
    
    System.out.print("Numero original " + numeroUsuario + ", al revés " + reves);
  }
}
