package Tema_4;

/*
*
* EJERCICIO 7
* calcula la media de 3 notas
*
*/

public class Ejercicio7 {
  public static void main(String[] args) {
	  
	System.out.println("Este programa calcula la media de 3 notas");
	
	System.out.print("Introduce la nota del primer examen: ");
    double nota1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la nota del segundo examen: ");
    double nota2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la nota del tercer examen: ");
    double nota3 = Integer.parseInt(System.console().readLine());
	
	if ((nota1 < 0 || nota2 < 0 || nota3 < 0) || (nota1 > 10 || nota2 > 10 || nota3 > 10)) {
		
		System.out.print("Las notas no pueden ser menores que 0 o mayores que 10");
		
	} else {
	
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.print("La media de tus notas es " + media);
	}
  }
}
