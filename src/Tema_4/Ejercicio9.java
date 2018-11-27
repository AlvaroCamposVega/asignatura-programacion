package Tema_4;

/*
*
* EJERCICIO 9
* resuelve una ecuación de 2º grado del tipo ax^2 + bx + c = 0
*
*/

public class Ejercicio9 {
  public static void main(String[] args) {

    System.out.println("Este programa resuelve ecuaciones de 2º grado del tipo");
    System.out.println(" ax^2 + bx +c = 0");
  
    System.out.print("Introduce el valor de a: ");
    String valorAStr = System.console().readLine();
    
    System.out.print("Introduce el valor de b: ");
    String valorBStr = System.console().readLine();
    
    System.out.print("Introduce el valor de c: ");
    String valorCStr = System.console().readLine();
    
    // INICIALIZACIÓN DE LAS VARIABLES
    double valorA;
    double valorB;
    double valorC;
    
    // SI A, B O C SON INTRODUCIDOS COMO VACÍO PASAN A SER 1
    if (valorAStr.equals("")) {
    
      valorA = 1;
    
    } else {
    
      valorA = Double.parseDouble(valorAStr);
    }
  
    if (valorBStr.equals("")) {
    
      valorB = 1;
    
    } else {
    
      valorB = Double.parseDouble(valorBStr);
    }
  
    if (valorCStr.equals("")) {
    
      valorC = 1;
    
    } else {
    
      valorC = Double.parseDouble(valorCStr);
    }
  
    // RESULTADOS
    /* Sacamos primero el radical para no alargar mucho la línea y no tener
     * que escribir dos veces la fórmula completa */
    double radical = Math.sqrt((valorB * valorB) - (4 * valorA * valorC));
    double resultado1 = (-(valorB) + radical) / (2 * valorA);
    double resultado2 = (-(valorB) - radical) / (2 * valorA);
  
    // MOSTRAMOS LOS RESULTADOS
    System.out.println();
    System.out.println("Resultado 1: x1 = " + resultado1);
    System.out.print("Resultado 2: x2 = " + resultado2);
  }
}
