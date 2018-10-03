/*
*
* EJERCICIO 6
* calcula el tiempo que tardará en caer un objeto desde una altura h
*
*/

public class Ejercicio6 {
  public static void main(String[] args) {
	  
	System.out.println("Este programa calcula el tiempo que tarda ");
	System.out.println("en caer un objeto desde una altura determinada");
	
	System.out.print("Indica la altura desde la que caerá el objeto: ");
    double altura = Integer.parseInt(System.console().readLine());
	
	if (!(altura > 0)) {
		
		System.out.print("La altura no puede ser ni 0 negativa");
	
	} else {
		
		double gravedad = 9.81;
		
		double tiempo = Math.sqrt((2 * altura) / gravedad);
		
		System.out.printf("El objeto tardará %.2f segundos en caer", tiempo);
	}
	
  }
}
