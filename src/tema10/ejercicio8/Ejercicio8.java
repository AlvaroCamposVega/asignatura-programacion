package tema10.ejercicio8;

import java.util.ArrayList;

/*
*
* EJERCICIO 8
* Realiza un programa que escoja al azar 10 cartas de la baraja española
* (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
* almacenarlas y asegúrate de que no se repite ninguna.
*
*/

public class Ejercicio8 {

    public static void main(String[] args) {

        ArrayList<Carta> a = new ArrayList<Carta>();
        Carta c = new Carta();
        a.add(c);
        boolean e;

        for (int i = 0; i < 9; i++) {

            e = true;

            while (e) { // Hacemos que la nueva carta no sea repetida

                e = false;
                c = new Carta();

                for (Carta b : a) {

                    if (b.equals(c)) {

                        e = true;
                    }
                }
            }

            a.add(c);
        }

        for (Carta b : a) {

            System.out.println(b);
        }
    }

}
