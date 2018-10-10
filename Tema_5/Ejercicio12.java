/*
*
* EJERCICIO 12
* Muestra los n primeros términos de la sucesión de fibonacci
*
*/

public class Ejercicio12 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int primerTermino = 0;
    int segundoTermino = 1;
    int siguienteTermino = 0;
    
    for (int i = 1; i <= numero; i++) {
      
      System.out.print(primerTermino + " ");
      
      if (i <= 2) {
        
        primerTermino = segundoTermino;
        
      } else {
        
        siguienteTermino = primerTermino + segundoTermino;
        segundoTermino = primerTermino;
        primerTermino = siguienteTermino;
      }
    }
  }
}
