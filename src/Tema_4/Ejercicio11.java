package Tema_4;

/*
*
* EJERCICIO 11
* calcula los segundos que faltan para medianoche dad una hora determinada
*
*/

public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.println("A continuación se le va a pedir que introduzca la hora ");
    System.out.println("y los minutos por separado");

    System.out.print("Introduce la hora actual: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int horasRestantes = 24 - hora;
    int minutosRestantes = 60 - minutos;
    
    int segundos = (horasRestantes * 3600) + (minutosRestantes * 60);
    
    System.out.print("Para la medianoche faltan " + segundos + " segundos");
    
  }
}
