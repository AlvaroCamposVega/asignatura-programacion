package tema8;

import java.util.Scanner;

public class BiblioArraysBi {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[][] arrayA = generaArrayBiInt(3, 2, 1, 10);
		
		for (int fila = 0; fila < 3; fila++) {
			
			for (int columna = 0; columna < 2; columna++) {
				
				System.out.print(arrayA[fila][columna] + " ");
			}
		
			System.out.println();
		}
		
		System.out.println();
		System.out.println(arrayA.length);
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

}
