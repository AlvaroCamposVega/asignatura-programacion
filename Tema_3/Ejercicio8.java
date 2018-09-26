/*
*
* EJERCICIO 8
* calcula el salario semanal de un empleado
*
*/

public class Ejercicio8 {
  public static void main(String[] args) {
  
	System.out.print("Introduzca las horas trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    int eurosHora = 12;
    int salario = (horas * eurosHora);
    
    System.out.println("Este empleado gana: " + salario + " euros a la semana");
  }
}
