package tema10;

import java.util.ArrayList;

import tema8.*;
/*
*
* EJERCICIO 1
* Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
* ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
* números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
* y 20 elementos ambos inclusive.
*
*/

public class Ejercicio2 {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<Integer>();
        int tamano = BiblioMatematicas.aleatorio(10, 20);

        for (int i = 0; i < tamano; i++) {

            a.add(BiblioMatematicas.aleatorio(0, 100));
            System.out.println(a.get(i));
        }

        System.out.println("-----------------------");
        System.out.println("Suma: " + BiblioArrayList.suma(a));
        System.out.println("Media: " + BiblioArrayList.media(a));
        System.out.println("Máximo: " + BiblioArrayList.maximo(a));
        System.out.println("Mínimo: " + BiblioArrayList.minimo(a));
    }

}
