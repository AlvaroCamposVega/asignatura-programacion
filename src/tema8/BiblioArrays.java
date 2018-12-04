package tema8;

public class BiblioArrays {
	
	// EJERCICIO 20 #################################################################
	/**
	 * Genera un array de tamaño n con números aleatorios
	 * @param Tamaño Tamaño del array
	 * @param Mínimo Mínimo del intervalo de los números aleatorios
	 * @param Máximo Máximo del intervalo
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
		 * @param Array Array
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
		 * @param Array Array
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
		 * @param Array Array
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
		 * @param Array Array
		 * @param Número Número que se quiere buscar
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
		 * @param Array Array
		 * @param Número Número que se quiere buscar
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
				
		// EJERCICIO 26 #################################################################
		/**
		 * Le da la vuelta a un array
		 * @param Array Array
		 * @return Array volteado
		 */
		public static int[] volteaArrayInt(int[] arrayN) {

			int[] arrayVolteado = new int[arrayN.length];
					
			for (int i = 0; i < arrayN.length; i++) {

				arrayVolteado[i] = arrayN[arrayN.length - (i + 1)];
			}
					
			return arrayVolteado;
		}
		
		// EJERCICIO 27 #################################################################
		/**
		* Rota N posiciones a la izquierda los números de un array
		* @param Array Array
		* @param Número Número de posiciones a rotar
		* @return Array rotado
		*/
		public static int[] rotaIzquierdaArrayInt(int[] arrayN, int numero) {
			
			int[] arrayAux = arrayN;
			int[] arrayRotado = new int[arrayAux.length];
							
			for (int i = 0; i < numero; i++) {
				
				int auxiliar = arrayAux[0];

				for (int j = 0; j < arrayAux.length - 1; j++) {

					arrayRotado[j] = arrayAux[j + 1];
				}
				
				arrayRotado[arrayRotado.length - 1] = auxiliar;
				arrayAux = arrayRotado;
			}
							
			return arrayRotado;
		}
		
		// EJERCICIO 28 #################################################################
		/**
		* Rota N posiciones a la derecha los números de un array
		* @param Array Array
		* @param Número Número de posiciones a rotar
		* @return Array rotado
		*/
		public static int[] rotaDerechaArrayInt(int[] arrayN, int numero) {
					
			int[] arrayAux = arrayN;
			int[] arrayRotado = new int[arrayAux.length];
									
			for (int i = 0; i < numero; i++) {
						
				int auxiliar = arrayAux[arrayAux.length - 1];

				for (int j = (arrayAux.length - 1); j > 0; j--) {

					arrayRotado[j] = arrayAux[j - 1];
				}
						
				arrayRotado[0] = auxiliar;
				arrayAux = arrayRotado;
			}
									
			return arrayRotado;
		}
		
		// IMPRIMIR ARRAY #################################################################
		/**
		* Imprime un array en consola
		* @param Array Array
		*/
		public static void imprimeArray(int[]arrayA) {
			
			for (int i = 0; i < arrayA.length; i++) {
				
				System.out.print(arrayA[i] + " ");
			}
			
			System.out.println();
		}
}
