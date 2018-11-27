package Tema_4;

/*
*
* EJERCICIO 23
* Calcula el precio final de un producto dada la base imponible, el tipo de iva
* y un código promocional
*
*/

public class Ejercicio23 {
  public static void main(String[] args) {
  
    System.out.print("Intoduce la base imponible del producto: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el IVA (general, reducido, superreducido): ");
    String tipoIVA = System.console().readLine().toLowerCase();
    
    System.out.print("Introduzca el código promicional (nopro, mitad, meno5, ");
    System.out.print("o 5porc): ");
    String codigoPro = System.console().readLine().toLowerCase();
    
    if (baseImponible < 0) {
      
      System.out.print("\nIntroduzca un precio válido por favor");
      
    } else { // Procedemos a aplicar el tipo de IVA
      
      double IVA = 0.0;
      String IVAStr = "0%";
      
      if (tipoIVA.equals("general")) {
        
        IVA = 0.21;
        IVAStr = "21%";
      }
      
      if (tipoIVA.equals("reducido")) {
        
        IVA = 0.10;
        IVAStr = "10%";
      }
      
      if (tipoIVA.equals("superreducido")) {
        
        IVA = 0.04;
        IVAStr = "4%";
      }
      
      IVA *= baseImponible; // IVA = IVA * baseImponible
      
      if (baseImponible == 0.0) { // El producto es gratuito
        
        System.out.println("\nEste producto es gratuito\n");
        System.out.println("-----------------------------");
        System.out.printf("%-20s %6.2f \n", "Base imponible", baseImponible);
        System.out.printf("%-20s %6.2f", "TOTAL ", 0.0);
        
      } else if (IVA == 0.0) { // Si es 0 hemos introducido mal el tipo de IVA
        
        System.out.print("\nIntroduzca un tipo de IVA válido por favor");
        
      } else {
        
        double precioIVA = baseImponible + IVA; // Producto con IVA
        
        // En principio no tenemos ningún código de promoción
        double promocion = 0.0;
        String codStr = "nopro";
        
        // Procedemos a aplicar la promoción correspondiente
        if (codigoPro.equals("mitad")) {
          
          promocion = 0.50;
          codStr = "mitad";
          promocion *= precioIVA;
          
        } else if (codigoPro.equals("meno5")) {
          
          promocion = 5.0;
          codStr = "meno5";
            
        } else if (codigoPro.equals("5porc")) {
          
          promocion = 0.05;
          codStr = "5porc";
          promocion *= precioIVA;
          
        } else {
          
          System.out.println();
          System.out.println("-----------------------------");
          System.out.print("Sin código promocional\nSi ha introducido un código ");
          System.out.print("promocional aseguresé\nde que lo ha introducido correctamente.");
        }
        
        double precio = precioIVA - promocion; // Precio total del producto
     
        System.out.println("\n-----------------------------");
        System.out.printf("%-20s %6.2f \n", "Base imponible", baseImponible);
        System.out.printf("%-20s %6.2f \n", "IVA (" + IVAStr + ") ", IVA);
        System.out.printf("%-20s %6.2f \n", "Precio con IVA ", precioIVA);
        System.out.printf("%-20s %6.2f \n", "Cód. promo. (" + codStr + "):", -promocion);
        System.out.printf("%-20s %6.2f", "TOTAL ", precio);
      }
    }
  }
}
