/*
*
* EJERCICIO 3
* convierte pesetas a euros
*
*/

public class Ejercicio3 {
  public static void main(String[] args) {

	int conversion = 166;
  
	System.out.print("Introduzca las pesetas que desea convertir: ");
    int pesetas = Integer.parseInt(System.console().readLine());

    int euros = (pesetas / conversion);
    System.out.print("Conversión realizada, usted recibe ");
   
	// Si la operación da 1 muestra euro en vez de euros
    if (euros == 1){
		
		System.out.print(euros + " euro");
		
	} else {
		
		System.out.print(euros + " euros");
	}
  }
}
