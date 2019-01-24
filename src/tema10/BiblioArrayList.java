package tema10;

import java.util.ArrayList;

public class BiblioArrayList {

    /**
     * Devuelve la suma de los números de un ArrayList
     * @param ArrayList<Integer> ArrayList en el cual se va a operar
     * @return Número La suma de los números del ArrayList
     */

    public static int suma(ArrayList<Integer> a) {

        int suma = 0;

        for (Integer n : a) {

            suma += n;
        }

        return suma;
    }

    /**
     * Devuelve la media de los números de un ArrayList
     * @param ArrayList<Integer> ArrayList en el cual se va a operar
     * @return Número La media de los números del ArrayList
     */

    public static int media(ArrayList<Integer> a) {

        int suma = 0;
        int media = 0;
        int numeros = 0;

        for (Integer n : a) {

            suma += n;
            numeros += 1;
        }

        media = suma / numeros;
        return media;
    }

    /**
     * Devuelve el máximo de los números de un ArrayList
     * @param ArrayList<Integer> ArrayList en el cual se va a operar
     * @return Número El máximo de los números del ArrayList
     */

    public static int maximo(ArrayList<Integer> a) {

        int maximo = a.get(0);

        for (Integer n : a) {

            if (n > maximo) {

                maximo = n;
            }
        }

        return maximo;
    }

    /**
     * Devuelve El mínimo de los números de un ArrayList
     * @param ArrayList<Integer> ArrayList en el cual se va a operar
     * @return Número El mínimo de los números del ArrayList
     */

    public static int minimo(ArrayList<Integer> a) {

        int minimo = a.get(0);

        for (Integer n : a) {

            if (n < minimo) {

                minimo = n;
            }
        }
        
        return minimo;
    }
}
