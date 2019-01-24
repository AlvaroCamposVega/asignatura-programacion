package tema10.ejercicio9;

import tema8.BiblioMatematicas;

public class Carta implements Comparable<Carta> {

	private String numero;
	private String palo;

	public Carta() {

		int t1 = BiblioMatematicas.aleatorio(1, 10);
		int t2 = BiblioMatematicas.aleatorio(1, 4);
		
		switch (t1) {
		
		case 1:
			this.numero = "1";
			break;
			
		case 2:
			this.numero = "2";
			break;
			
		case 3:
			this.numero = "3";
			break;
			
		case 4:
			this.numero = "4";
			break;
			
		case 5:
			this.numero = "5";
			break;
			
		case 6:
			this.numero = "6";
			break;
			
		case 7:
			this.numero = "7";
			break;
			
		case 8:
			this.numero = "10";
			break;
			
		case 9:
			this.numero = "11";
			break;
			
		case 10:
			this.numero = "12";
			break;
		}
		
		switch (t2) {
		
		case 1:
			this.palo = "oros";
			break;
			
		case 2:
			this.palo = "bastos";
			break;
			
		case 3:
			this.palo = "espadas";
			break;
			
		case 4:
			this.palo = "copas";
			break;
		}
	}

	public String getNumero() {
		
		return numero;
	}

	public String getPalo() {
		
		return palo;
	}
	
	public boolean repetida(Carta c) {
		
		return (this.getPalo().equals(c.getPalo()) && this.getNumero().equals(c.getNumero()));
	}
	
	public int compareTo(Carta c) {
			
		return this.palo.compareTo(c.getPalo());
	}
	
	public boolean equals(Carta c) {
		
		return this.palo.equals(c.getPalo());
	}
	
	@Override
	public String toString() {
		
		return numero + " de " + palo;
	}

}
