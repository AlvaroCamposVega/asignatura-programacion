/*
*
* EJERCICIO 8
* calcula la media de 3 notas e indica que nota tendrías en el boletín
*
*/

public class Ejercicio8 {
  public static void main(String[] args) {

    System.out.println("Este programa calcula la media de 3 notas");
  
    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la nota del segundo examen: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la nota del tercer examen: ");
    double nota3 = Double.parseDouble(System.console().readLine());
  
  if ((nota1 < 0 || nota2 < 0 || nota3 < 0) || (nota1 > 10 || nota2 > 10 || nota3 > 10)) {
    
    System.out.print("Las notas no pueden ser menores que 0 o mayores que 10");
    
  } else {
  
    double media = (nota1 + nota2 + nota3) / 3;
    System.out.println("La media de tus notas es " + media);
    
    if (media < 5) {
      
      System.out.print("Boletín: Insuficiente");
      
    } else if (media < 6) {
      
      System.out.print("Boletín: Suficiente");
    
    } else if (media < 7) {
      
      System.out.print("Boletín: Bien");
      
    } else if (media < 9) {
      
      System.out.print("Boletín: Notable");
      
    } else {
      
      System.out.print("Boletín: Sobresaliente");
    }
  }
  }
}
