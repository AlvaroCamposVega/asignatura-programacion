/*
*
* EJERCICIO 22
* Calcula los minutos que faltan para el fin de semana
*
*/

public class Ejercicio22 {
  public static void main(String[] args) {
  
    System.out.print("Intoduce un día de la semana (lunes a viernes): ");
    String diaSemana = System.console().readLine().toLowerCase();
    
    System.out.print("Ahora la hora y los minutos todo junto (ej: 2300): ");
    int horaMinutos = Integer.parseInt(System.console().readLine());

    // Dividimos el valor introducido en dos variables
    int horasUsuario = horaMinutos / 100; // Sacamos la hora
    int minutosUsuario = horaMinutos % 100; // Sacamos los minutos
    
    // Pasamos las horas a minutos y sumamos para obtener los minutos totales
    int minutos = (horasUsuario * 60) + minutosUsuario;
    
    // Almacena los minutos restantes para que sea fin de semana
    int minutosRestFinde = 0;
    // Almacena los minutos totales para que llegue el fin de semana
    int minutosFinde = 0;
    
    if (diaSemana.equals("lunes")) {
      
      // Minutos que tiene un día
      int minutosDia = 24 * 60; 
      // Los minutos que deben pasar para que sea fin de semana
      minutosFinde = (minutosDia * 4) + (15 * 60);
      
      // Los minutos que faltan para el finde
      minutosRestFinde = minutosFinde - minutos;
      
    } else if (diaSemana.equals("martes")) {
      
      int minutosDia = 24 * 60; 
      minutosFinde = (minutosDia * 3) + (15 * 60);
      
      minutosRestFinde = minutosFinde - minutos;
      
    } else if (diaSemana.equals("miércoles")) {
      
      int minutosDia = 24 * 60; 
      minutosFinde = (minutosDia * 2) + (15 * 60);

      minutosRestFinde = minutosFinde - minutos;
      
    } else if (diaSemana.equals("jueves")) {
      
      int minutosDia = 24 * 60; 
      minutosFinde = minutosDia + (15 * 60);

      minutosRestFinde = minutosFinde - minutos;
      
    } else if (diaSemana.equals("viernes")) {
      
      // Los minutos que deben pasar para que sea fin de semana
      minutosFinde = 15 * 60;

      minutosRestFinde = minutosFinde - minutos;
    }
    
    System.out.print("Minutos restantes para el finde: " + minutosRestFinde);
  }
}
