package Tema_4;

/*
*
* EJERCICIO 25
* Calcula el precio de una bandera dado el alto y el ancho
*
*/

public class Ejercicio25 {
  public static void main(String[] args) {
  
    System.out.print("Intoduce la altura de la bandera en cm: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.print("Ahora la anchura: ");
    double anchura = Double.parseDouble(System.console().readLine());
    
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    String escudo = System.console().readLine().toLowerCase();
    
    if (altura <= 0) {
      
      System.out.print("\nIntroduzca una altura válida por favor");
      
    } else if (anchura <= 0) {
      
      System.out.print("\nIntroduzca una anchura válida por favor");
      
    } else if (!escudo.equals("s") && !escudo.equals("n")) {
      
      System.out.print("\nResponda solo con S o N por favor");
      
    } else {
    
      double cm2 = altura * anchura;
      double precioBandera = cm2 / 100;
      double precioEscudo = 0.0;
      String snEscudo = "Sin";
      double gastosEnvio = 3.25;
      
      if (escudo.equals("s")) {
        
        precioEscudo = 2.50;
        snEscudo = "Con";
      }
        
      double precioTotal = precioBandera + precioEscudo + gastosEnvio;
        
      System.out.println("\nGracias. Aquí tiene la información de su compra.");
      System.out.println("--------------------------");
      System.out.printf("%-21s %6.2f %-1s \n", "Bandera de " + cm2 + "cm2:", precioBandera, "€");
      System.out.printf("%-21s %6.2f %-1s \n", snEscudo + " escudo:", precioEscudo, "€");
      System.out.printf("%-21s %6.2f %-1s \n", "Gastos de envío:", gastosEnvio, "€");
      System.out.printf("%-21s %6.2f %-1s \n", "Total:", precioTotal, "€");
    }
  }
}
