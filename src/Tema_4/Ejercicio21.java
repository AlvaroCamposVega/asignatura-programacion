package Tema_4;

/*
*
* EJERCICIO 21
* Calcula la nota de la asignatura de programación
*
*/

public class Ejercicio21 {
  public static void main(String[] args) {
  
    System.out.print("Intoduce la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Intoduce la nota del segundo examen: ");
    double nota2 = Double.parseDouble(System.console().readLine());

    double media = (nota1 + nota2) / 2;
    
    if ((nota1 > 10 || nota1 < 0) || (nota2 > 10) || nota2 < 0) {
      
      System.out.print("Introduce una nota válida por favor ");
      
    } else {

      if (media < 5) {
        
        System.out.print("Intoduce el resultado del examen de recuperación (apto/no apto): ");
        String notaRec = System.console().readLine().toLowerCase();
        
        if ((!notaRec.equals("apto")) && (!notaRec.equals("no apto"))) {
          
          System.out.print("Tienes que contestar con apto o no apto");
          
        } else if (notaRec.equals("apto")) {
          
          System.out.print("Tu nota de programación es un 5" );
          
        } else {
          
          System.out.print("Tu nota de programación es un " + media);
        }
        
      } else {
        
        System.out.print("Tu nota de programación es un " + media);
      }
    }
  }
}
