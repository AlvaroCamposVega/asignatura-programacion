package tema8;
import java.util.Scanner;

/*
 * 
 * Menú de Prueba para las funciones
 * 
 */

public class MenuFunciones {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner s = new Scanner(System.in);
		
		int opcion = 1;
		
		while (opcion != 0) {
		
			System.out.println("######################################");
			System.out.println("########### MENÚ FUNCIONES ###########");
			System.out.println("######################################\n");
			
			System.out.println("Selecciona una función:");
			System.out.println("1. esCapicua");
			System.out.println("2. esPrimo");
			System.out.println("3. siguientePrimo");
			System.out.println("4. potencia");
			System.out.println("5. digitos");
			System.out.println("6. voltea");
			System.out.println("7. digitoN");
			System.out.println("8. posicionDeDigito");
			System.out.println("9. quitaPorDetras");
			System.out.println("10. quitaPorDelante");
			System.out.println("11. pegaPorDetras");
			System.out.println("12. pegaPorDelante");
			System.out.println("13. trozoDeNumero");
			System.out.println("14. juntaNumeros");
			System.out.println("0. SALIR\n");
			
			System.out.print("Elige una opción: ");
			opcion = Integer.parseInt(s.nextLine());
			
			int numero;
			
			switch (opcion) {
			
				case 1:
					System.out.print("Introduce un número: ");
					numero = Integer.parseInt(s.nextLine());
					System.out.println(BiblioMatematicas.esCapicua(numero));
					Thread.sleep(2000);
					break;
					
				case 2:
					System.out.print("Introduce un número: ");
					numero = Integer.parseInt(s.nextLine());
					System.out.println(BiblioMatematicas.esPrimo(numero));
					Thread.sleep(2000);
					break;
					
				case 3:
					System.out.print("Introduce un número: ");
					numero = Integer.parseInt(s.nextLine());
					System.out.println(BiblioMatematicas.siguientePrimo(numero));
					Thread.sleep(2000);
					break;
					
				case 4:
					System.out.print("Introduce la base: ");
					int base = Integer.parseInt(s.nextLine());
					System.out.print("Introduce el exponente: ");
					int exponente = Integer.parseInt(s.nextLine());
					System.out.println(BiblioMatematicas.potencia(base, exponente));
					Thread.sleep(2000);
					break;
					
				case 5:
					System.out.print("Introduce un número: ");
					numero = Integer.parseInt(s.nextLine());
					System.out.println(BiblioMatematicas.digitos(numero));
					Thread.sleep(2000);
					break;
					
				case 6:
					System.out.print("Introduce un número: ");
					numero = Integer.parseInt(s.nextLine());
					System.out.println(BiblioMatematicas.voltea(numero));
					Thread.sleep(2000);
					break;
					
				case 7:
					System.out.print("Introduce un número: ");
					numero = Integer.parseInt(s.nextLine());
					System.out.print("Introduce la posicion: ");
					int posicion = Integer.parseInt(s.nextLine());
					System.out.println(BiblioMatematicas.digitoN(numero, posicion));
					Thread.sleep(2000);
					break;
					
				case 8:
					System.out.print("Introduce un número: ");
					numero = Integer.parseInt(s.nextLine());
					System.out.print("Introduce el digito: ");
					int digito = Integer.parseInt(s.nextLine());
					System.out.println(BiblioMatematicas.posicionDeDigito(numero, digito));
					Thread.sleep(2000);
					break;
					
				case 9:
					System.out.print("Introduce un número: ");
					numero = Integer.parseInt(s.nextLine());
					System.out.print("Introduce cuántos digitos: ");
					int digitos = Integer.parseInt(s.nextLine());
					System.out.println(BiblioMatematicas.quitaPorDetras(numero, digitos));
					Thread.sleep(2000);
					break;
					
				case 10:
					System.out.print("Introduce un número: ");
					numero = Integer.parseInt(s.nextLine());
					System.out.print("Introduce cuántos digitos: ");
					int digitos2 = Integer.parseInt(s.nextLine());
					System.out.println(BiblioMatematicas.quitaPorDelante(numero, digitos2));
					Thread.sleep(2000);
					break;
					
				case 11:
					System.out.print("Introduce un número: ");
					numero = Integer.parseInt(s.nextLine());
					System.out.print("Introduce el digito: ");
					int digito2 = Integer.parseInt(s.nextLine());
					System.out.println(BiblioMatematicas.pegaPorDetras(numero, digito2));
					Thread.sleep(2000);
					break;
					
				case 12:
					System.out.print("Introduce un número: ");
					numero = Integer.parseInt(s.nextLine());
					System.out.print("Introduce el digito: ");
					int digito3 = Integer.parseInt(s.nextLine());
					System.out.println(BiblioMatematicas.pegaPorDelante(numero, digito3));
					Thread.sleep(2000);
					break;
					
				case 13:
					System.out.print("Introduce un número: ");
					numero = Integer.parseInt(s.nextLine());
					System.out.print("Introduce el inicio: ");
					int inicio = Integer.parseInt(s.nextLine());
					System.out.print("Introduce el fin: ");
					int fin = Integer.parseInt(s.nextLine());
					System.out.println(BiblioMatematicas.trozoDeNumero(numero, inicio, fin));
					Thread.sleep(2000);
					break;
					
				case 14:
					System.out.print("Introduce un número: ");
					numero = Integer.parseInt(s.nextLine());
					System.out.print("Introduce otro: ");
					int numero2 = Integer.parseInt(s.nextLine());
					System.out.println(BiblioMatematicas.juntaNumeros(numero, numero2));
					Thread.sleep(2000);
					break;
			}
			
			System.out.print("\n");
		}
	}

}
