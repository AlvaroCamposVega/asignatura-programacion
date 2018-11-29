package tema8;

import java.util.Scanner;

public class BiblioArrays {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce un número");
		int tamano = Integer.parseInt(s.nextLine());
		System.out.print("Introduce un número");
		int min = Integer.parseInt(s.nextLine());
		System.out.print("Introduce un número");
		int max = Integer.parseInt(s.nextLine());
		
		int[] prueba = generaArrayInt(tamano, min, max);
		
		for (int i = 0; i < prueba.length; i++) {
			
			System.out.print(prueba[i] + " ");
		}
		
		System.out.println("\nIntroduce numero buscado: ");
		int numero = Integer.parseInt(s.nextLine());
		
		System.out.println(posicionEnArray(prueba, numero));
	}
	
	// EJERCICIO 20 #################################################################
	/**
	 * Genera un array de tamaño n con números aleatorios
	 * @param Tamaño del array
	 * @param Mínimo del intervalo de los números aleatorios
	 * @param Máximo del intervalo
	 * @return Un array de N tamaño con números aleatorios
	 * comprendidos entre MIN y MAX
	 */
	public static int[] generaArrayInt(int tamano, int min, int max) {
		
		int[] arrayRd = new int[tamano];
		
		for (int i = 0; i < arrayRd.length; i++) {
			
			arrayRd[i] = BiblioMatematicas.aleatorio(min, max);
		}
		
		return arrayRd;
	}
	
	// EJERCICIO 21 #################################################################
		/**
		 * Devuelve el mínimo de un array
		 * @param Array
		 * @return El mínimo del array
		 */
		public static int minimoArrayInt(int[] arrayN) {
			
			int min = arrayN[0];
			
			for (int i = 0; i < arrayN.length; i++) {
				
				if (min > arrayN[i]) {
					
					min = arrayN[i];
				}
			}
			
			return min;
		}
		
		// EJERCICIO 22 #################################################################
		/**
		 * Devuelve el máximo de un array
		 * @param Array
		 * @return El máximo del array
		 */
		public static int maximoArrayInt(int[] arrayN) {
					
			int max = arrayN[0];
					
			for (int i = 0; i < arrayN.length; i++) {
						
				if (max < arrayN[i]) {
							
					max = arrayN[i];
				}
			}
					
			return max;
		}
		
		// EJERCICIO 23 #################################################################
		/**
		 * Devuelve la media de un array
		 * @param Array
		 * @return La media del array
		 */
		public static double mediaArrayInt(int[] arrayN) {
							
			double media = 0;
							
			for (int i = 0; i < arrayN.length; i++) {
								
				media += arrayN[i];
			}
			
			return media /= arrayN.length;
		}
		
		// EJERCICIO 24 #################################################################
		/**
		 * Dice si un número está dentro del array
		 * @param Array
		 * @param Número que se quiere buscar
		 * @return True si el número existe
		 */
		public static boolean estaEnArrayInt(int[] arrayN, int numero) {
			
			for (int i = 0; i < arrayN.length; i++) {
				
				if (arrayN[i] == numero) {
					
					return true;
				}
			}
			
			return false;
		}
		
		// EJERCICIO 25 #################################################################
		/**
		 * Busca un número y devuelve su posición en el array
		 * @param Array
		 * @param Número que se quiere buscar
		 * @return Posición del número en el array
		 */
				public static int posicionEnArray(int[] arrayN, int numero) {
					
					if (estaEnArrayInt(arrayN, numero)) {
					
						for (int i = 0; i < arrayN.length; i++) {
							
							if (arrayN[i] == numero) {
								
								return i;
							}
						}
						
						return -1;
					}
						
					return -1;
				}
					

}
