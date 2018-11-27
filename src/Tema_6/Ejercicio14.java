package Tema_6;

/*
*
* EJERCICIO 14
* La máquina intentará adivinar el número que estás pensando
*
*/
import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int oportunidades = 5;
    int numeroPensado;
    int minimo = 0;
    int maximo = 100;
    boolean acertado = false;
    int mayorMenorOIgual;
        
    System.out.println("Tengo 5 intentos para adivinar un número del 1 al 100 que tú pienses.");
    System.out.println("Dale a intro.");
    s.nextLine();

    do {
      
      numeroPensado = (int)(Math.random() * (maximo - minimo) + minimo);
      System.out.println("¿Es el " + numeroPensado + "?");
      System.out.println ("El número es:");
      System.out.println ("1) Mayor");
      System.out.println ("2) Menor");
      System.out.println ("3) Es correcto");
      mayorMenorOIgual = Integer.parseInt(s.nextLine());
      oportunidades--;

      if ( (mayorMenorOIgual == 1) && (oportunidades > 0) )
      
        minimo = numeroPensado + 1;
      
      if ( (mayorMenorOIgual == 2) && (oportunidades > 0) )
      
        maximo = numeroPensado - 1;
      
      if (mayorMenorOIgual == 3) {
        
        acertado = true;
        System.out.println("Siuuuu ¡he acertado!");
      }
      
    } while(!acertado && (oportunidades > 0));
    
    if (!acertado) {
      
      System.out.println("No lo he conseguido :( .");
    }
  }
}
