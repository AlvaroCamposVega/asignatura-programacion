package tema10.ejercicio7;

import tema8.BiblioMatematicas;

public class Moneda {

    private String valor;
    private String posicion;

    public Moneda() {

        int t1 = BiblioMatematicas.aleatorio(1, 8);
        int t2 = BiblioMatematicas.aleatorio(1, 2);

        switch (t1) {

        case 1:
            this.valor = "1 céntimo";
            break;

        case 2:
            this.valor = "2 céntimos";
            break;

        case 3:
            this.valor = "5 céntimos";
            break;

        case 4:
            this.valor = "10 céntimos";
            break;

        case 5:
            this.valor = "20 céntimos";
            break;

        case 6:
            this.valor = "50 céntimos";
            break;

        case 7:
            this.valor = "1 euro";
            break;

        case 8:
            this.valor = "2 euros";
            break;
        }

        switch (t2) {

        case 1:
            this.posicion = "cara";
            break;

        case 2:
            this.posicion = "cruz";
            break;
        }
    }

    public String getValor() {

        return valor;
    }

    public String getPosicion() {

        return posicion;
    }

    @Override
    public String toString() {

        return this.valor + " - " + this.posicion;
    }

}
