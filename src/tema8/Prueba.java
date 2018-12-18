package tema8;

public class Prueba {

	public static void main(String[] args) {

//		int[][] arrayA = BiblioArraysBi.generaArrayBiInt(4, 4, 1, 20);
		int[][] arrayA = new int[][] {{4, 2, 3}, {4, 1, 6}, {7, 1, 9}};
		
		BiblioArraysBi.pintaArrayBi(arrayA);
		System.out.println();
//		BiblioArrays.pintaArray(BiblioArraysBi.coordenadasEnArrayBiInt(3, arrayA));
		System.out.print(BiblioArraysBi.esPuntoDeSilla(2, arrayA));

	}

}
