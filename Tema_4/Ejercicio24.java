/*
*
* EJERCICIO 24
* Genera la nómina de un empleado
*
*/

public class Ejercicio24 {
  public static void main(String[] args) {
  
    System.out.println("1. Programador junior");
    System.out.println("2. Programador senior");
    System.out.println("3. Jefe de proyecto\n");
  
    System.out.print("Intoduce el cargo del empleado (1 - 3): ");
    int cargo = Integer.parseInt(System.console().readLine());
    
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int dias = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    
    if (cargo != 1 && cargo != 2 && cargo != 3) {
      
      System.out.print("\nIntroduzca un cargo válido por favor");
      
    } else if (estadoCivil != 1 && estadoCivil != 2) {
      
      System.out.print("\nIntroduzca un estado civil válido por favor");
      
    } else {
      
      int sueldoBase = 0;
      
      if (cargo == 1) {
        
        sueldoBase = 950;
      }
      
      if (cargo == 2) {
        
        sueldoBase = 1200;
      }
      
      if (sueldoBase == 3) {
        
        sueldoBase = 1600;
      }
      
      // Hacemos los cálculos
      double viajes = dias * 30;
      double sueldoBruto = sueldoBase + viajes;
      double IRPF = (double)(sueldoBruto * 0.20);
      double sueldoNeto = (double)(sueldoBruto - IRPF);
      
      System.out.println("###################################");
      System.out.printf("# %-22s %8.2f %-1s \n", "Sueldo base", (double)sueldoBase, "#");
      System.out.printf("# %-22s %8.2f %-1s \n", "Dietas (" + dias + " viajes)", viajes, "#");
      System.out.println("###################################");
      System.out.printf("# %-22s %8.2f %-1s \n", "Sueldo bruto", sueldoBruto, "#");
      System.out.printf("# %-22s %8.2f %-1s \n", "Retención IRPF (20%)", IRPF, "#");
      System.out.println("###################################");
      System.out.printf("# %-22s %8.2f %-1s \n", "Sueldo neto", sueldoNeto, "#");
      System.out.print("###################################");
    }
  }
}
