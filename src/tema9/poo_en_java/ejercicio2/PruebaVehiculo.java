package tema9.poo_en_java.ejercicio2;

import java.util.Scanner;

public class PruebaVehiculo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int opcion = 0;
		
		Bicicleta bicicleta = new Bicicleta("azul");
		Coche coche = new Coche("seat");
		
		while(opcion != 8) {
			
			System.out.println("VEHÍCULOS");
			System.out.println("=========");
			System.out.println("1. Anda con la bicicleta");
			System.out.println("2. Haz el caballito con la bicicleta");
			System.out.println("3. Anda con el coche");
			System.out.println("4. Quema rueda con el coche");
			System.out.println("5. Ver kilometraje de la bicicleta");
			System.out.println("6. Ver kilometraje del coche");
			System.out.println("7. Ver kilometraje total");
			System.out.println("8. Salir");
			System.out.print("Elige una opción (1-8): ");
			opcion = Integer.parseInt(s.nextLine());
			System.out.println();
			
			switch (opcion) {
				
				case 1:
					bicicleta.andar();
					break;
					
				case 2:
					bicicleta.caballito();
					break;
					
				case 3:
					coche.andar();
					break;
					
				case 4:
					coche.quemarRueda();
					break;
					
				case 5:
					System.out.println("La bicicleta ha recorrido " + bicicleta.getKilometrosRecorridos() + "km\n");
					break;
					
				case 6:
					System.out.println("El coche ha recorrido " + coche.getKilometrosRecorridos() + "km\n");
					break;
					
				case 7:
					System.out.println("Los vehículos han recorrido " + Vehiculo.getKilometrosTotales() + "km\n");
					break;
					
				case 8:
					opcion = 8;
					break;
			}
		}
	}

}
