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
	* @param Número Tamaño N
	* @param Número Tamaño M
	* @param Número Intervalo mínimo aleatorio
	* @param Número Intervalo máximo aleatorio
	* @return Array Bi Array bidimensional
	*/
	public static int[][] generaArrayBiInt(int tamanoN, int tamanoM, int min, int max) {
		
		int[][] arrayRd = new int[tamanoN][tamanoM];
		
		for (int fila = 0; fila < tamanoN; fila++) {
			
			for (int columna = 0; columna < tamanoM; columna++) {
			
				arrayRd[fila][columna] = BiblioMatematicas.aleatorio(min, max);
			}
		}
		
		return arrayRd;
	}
	
	// EJERCICIO 30 #################################################################
	/**
	* Devuelve la fila de un array
	* @param Número Fila del array
	* @param Array Array bidimensional
	* @return Array Array con los valores de la fila
	*/
	public static int[] filaDeArrayBiInt(int fila, int[][] arrayN) {
		
		if (fila > arrayN[0].length - 1) {
			
			return new int[]{-1};
		}
		
		int[] arrayA = new int[arrayN[0].length];
			
		for (int i = 0; i < arrayN[0].length; i++) {
				
			arrayA[i] = arrayN[fila][i];
		}
			
		return arrayA;
	}
	
	// EJERCICIO 31 #################################################################
	/**
	* Devuelve la columna de un array
	* @param Número Columna del array
	* @param Array Array bidimensional
	* @return Array Array con los valores de la columna
	*/
	public static int[] columnaDeArrayBiInt(int columna, int[][] arrayN) {
			
		if (columna > arrayN.length - 1) {
				
			return new int[]{-1};
		}
			
		int[] arrayA = new int[arrayN.length];
				
		for (int i = 0; i < arrayN.length; i++) {
					
			arrayA[i] = arrayN[i][columna];
		}
				
		return arrayA;
	}
	
	// EJERCICIO 32 #################################################################
	/**
	* Devuelve la fila y la columna de la primera ocurrencia de un
	* número en un array bidimensional
	* @param Número Número buscado
	* @param Array Bi Array bidimensional
	* @return Array Array con la fila y la columna del número
	*/
	
	public static int[] coordenadasEnArrayBiInt(int numero, int[][] arrayN) {
	
		int[] arrayR = new int[] {-1, -1};
		
		for (int fila = 0; fila < arrayN[0].length; fila++) {
			
			for (int columna = 0; columna < arrayN.length; columna++) {
				
				if (numero == arrayN[fila][columna]) {
					
					arrayR[0] = fila;
					arrayR[1] = columna;
					
					return arrayR;
				}
			}
		}
		
		return arrayR;
	}

	// EJERCICIO 33 #################################################################
	/**
	* Devuelve true si un número es punto de silla (mínimo en su fila
	* y máximo en su columna)
	* @param Número Número buscado
	* @param Array Bi Array bidimensional
	* @return Boolean True si es punto de silla
	*/
		
	public static boolean esPuntoDeSilla(int numero, int[][] arrayN) {

		int[] coordenadas = coordenadasEnArrayBiInt(numero, arrayN);
			
		if (coordenadas[0] == (-1) && coordenadas[1] == (-1)) {
				
			return false;
		}
				
		int minimo = BiblioArrays.minimoArrayInt(filaDeArrayBiInt(coordenadas[0], arrayN));
		int maximo = BiblioArrays.maximoArrayInt(columnaDeArrayBiInt(coordenadas[1], arrayN));
			
		return (minimo == maximo && minimo == numero);
	}
	
	// EJERCICIO 34 #################################################################
	/**
	* Devuelve un array que contiene una de las diagonales del
	* array bidimensional
	* @param Número Fila
	* @param Número Columna
	* @param String Dirección (nose, neso)
	* @param Array Bi Array bidimensional
	* @return Array Array 
	*/
			
	public static int[] diagonal(int fila, int columna, String direccion, int[][] arrayN) {
		
		int elementos = 0, i, j;
	    int[] diagonalAux = new int [1000];
	    
	    for (i = 0; i < arrayN.length; i++) {
	    	
	    	for (j = 0; j < arrayN[0].length; j++) {
	    		
		        if ( (((columna - j) == (fila - i)) && (direccion.equals("nose")))
		          || (((columna - j) == (i - fila)) && (direccion.equals("neso"))) ) {
		        	
		        	diagonalAux[elementos++] = arrayN[i][j];
		        }
	      }
	    }

	    int[] diagonal = new int[elementos];
	    
	    for (j = 0; j < elementos; j++) {
	    	
	    	diagonal[j] = diagonalAux[j];
	    }

	    return diagonal;
	}
}
