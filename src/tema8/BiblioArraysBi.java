package tema8;

public class BiblioArraysBi {
	
	// IMPRIMIR ARRAY BIDIMENSIONAL #################################################################
	/**
	* Imprime un array bidimensional en consola
	* @param Array Bi Array bidimensional
	*/
	public static void pintaArrayBi(int[][] arrayN) {
		
		for (int fila = 0; fila < arrayN.length; fila++) {
			
			for (int columna = 0; columna < arrayN[0].length; columna++) {
				
				System.out.print(arrayN[fila][columna] + " ");
			}
		
			System.out.println();
		}
	}
	
	// EJERCICIO 29 #################################################################
	/**
	* Genera un array bidimensional con números aleatorios
	* @param Tamaño Tamaño N
	* @param Tamaño Tamaño M
	* @param Intervalo Intervalo mínimo aleatorio
	* @param Intervalo Intervalo máximo aleatorio
	* @return Array bidimensional
	*/
	public static int[][] generaArrayBiInt(int tamanoN, int tamanoM, int min, int max) {
		
		int[][] arrayRd = new int[tamanoN][tamanoM];
		
		for (int fila = 0; fila < tamanoN; fila++) {
			
			for (int columna = 0; columna < tamanoM; columna++)
			
			arrayRd[fila][columna] = BiblioMatematicas.aleatorio(min, max);
		}
		
		return arrayRd;
	}
	
	// EJERCICIO 30 #################################################################
	/**
	* Devuelve la fila de un array
	* @param Fila Fila del array
	* @param Array Array
	* @return Array Array con los valores de la fila
	*/
	public static int[] filaDeArrayBiInt(int fila, int[][] arrayN) {
		
		if (fila > arrayN.length - 1) {
			
			return new int[]{-1};
		}
		
		int[] arrayA = new int[arrayN.length];
			
		for (int i = 0; i < arrayN.length; i++) {
				
			arrayA[i] = arrayN[fila][i]; 
		}
			
		return arrayA;
	}

}
