package tema9.poo_en_java.ejercicio3;

public class Gato extends Mamifero{
	
	private String raza;

	public Gato(String raza) {

		super();
		this.raza = raza.toLowerCase();
	}
	
	public void maullar() {
		
		System.out.println("Miau miau\n");
	}
	
	public void ronronear() {
		
		System.out.println("RrrrrRrr\n");
	}
	
	public void cazar() {
		
		System.out.println("Venid a mi ratones!");
	}

	public String getRaza() {
		return raza;
	}
}
