package tema9.poo_en_java.ejercicio5;

public class Pizza {
	
	private String tamanio;
	private String tipo;
	private String estado = "pedida";
	
	private static int totalPedidas = 0;
	private static int totalServidas = 0;

	public Pizza(String tipo, String tamanio) {

		this.setTipo(tipo.toLowerCase());
		this.setTamanio(tamanio.toLowerCase());
		
		Pizza.totalPedidas += 1;
	}
	
	public void sirve() {
		
		if (this.getEstado().equals("servida")) {
			
			System.out.println("esa pizza ya se ha servido");
			
		} else {
		
			Pizza.totalServidas += 1;
			this.setEstado("servida");
		}
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public static int getTotalPedidas() {
		return totalPedidas;
	}

	public static int getTotalServidas() {
		return totalServidas;
	}
	
	@Override
	public String toString() {
		
		return "pizza " + this.getTipo() + " " + this.getTamanio() + ", " + this.getEstado();
	}
}
