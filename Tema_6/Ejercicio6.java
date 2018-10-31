/*
*
* EJERCICIO 6
* Advina un número entre 0 y 100
*
*/

public class Ejercicio6 {
  public static void main(String[] args) {
    
    int oportunidades = 5;
    int numero;
    boolean acertado = false;
    int numeroAzar = (int)(Math.random() * 101);
    
    System.out.println("He pensando un número del 0 al 100, tienes 5 oportunidades.");

    do {
      
      System.out.print("Introduce un número: ");
      numero = Integer.parseInt(System.console().readLine());
      oportunidades--;

      if ( (numero > numeroAzar) && (oportunidades > 0) ){
        
        System.out.println("El número es menor que " + numero);
        System.out.println("Te quedan " + oportunidades + " intentos");
      }
      
      if ( (numero < numeroAzar) && (oportunidades > 0) ){
        
        System.out.println("El número es mayor que " + numero);
        System.out.println("Te quedan " + oportunidades + " intentos");
      }
      
      if (numero == numeroAzar) {
        
        acertado = true;
        System.out.println("¡Has acertado!");
      }
      
    } while (!acertado && (oportunidades > 0));
    
    if (!acertado) {
      
      System.out.println("Has perdidio todas tus oportunidades, el número era el " + numeroAzar);
    }
  }
}
