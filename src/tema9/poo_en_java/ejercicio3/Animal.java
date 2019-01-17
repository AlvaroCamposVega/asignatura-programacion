package tema9.poo_en_java.ejercicio3;

public class Animal{
	
	private int animales = 0;

	public Animal() {

		animales += 1;
	}
	
	public void comer(String alimento) throws InterruptedException{
		
		System.out.println("Ñam ñam...");
		Thread.sleep(2000);
		System.out.println(alimento + " Está Rico rico!!\n");
	}
	
	public void dormir() {
		
		System.out.println("ZzZzZzzZzzz...\n");
	}

	public int getAnimales() {
		
		return animales;
	}
}
