package tema10.ejercicio7;

import java.util.ArrayList;

/*
*
* EJERCICIO 7
* La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
* un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
* anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
* céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
* cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
* siguiendo la pauta correcta. Cada moneda generada debe ser una instancia
* de la clase Moneda y la secuencia se debe ir almacenando en una lista.
*
*/

public class Ejercicio7 {

    public static void main(String[] args) {

        ArrayList<Moneda> a = new ArrayList<Moneda>();

        Moneda m = new Moneda();
        a.add(m);

        for (int i = 0; i < 5; i++) {

            m = new Moneda();

            while (!m.getValor().equals(a.get(i).getValor()) && !m.getPosicion().equals(a.get(i).getPosicion())) {

                m = new Moneda();
            }

            a.add(m);
        }

        for (Moneda b : a) {

            System.out.println(b);
        }
    }

}
